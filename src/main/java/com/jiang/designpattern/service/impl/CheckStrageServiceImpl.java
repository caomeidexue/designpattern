package com.jiang.designpattern.service.impl;

import com.jiang.designpattern.enums.ConsolidationResultStrategyEnum;
import com.jiang.designpattern.enums.FilterProjectsEnum;
import com.jiang.designpattern.model.request.CheckRequestDO;
import com.jiang.designpattern.model.response.CheckResutlDO;
import com.jiang.designpattern.service.CheckHandlerAdapter;
import com.jiang.designpattern.service.CheckStrageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerAdapter;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 10:57 上午
 */
@Service
public class CheckStrageServiceImpl implements CheckStrageService {


    @Autowired
    @Qualifier( "executor" )
    private Executor executor;


    @Autowired
    private ApplicationContext applicationContext;


    private Map<Integer, CheckHandlerAdapter>  checkHandlerAdapterMap = new ConcurrentHashMap<>();


    @Override
    public CheckResutlDO doCheck(List<Integer> list, CheckRequestDO checkRequestDO) {
        // TODO: 2021/5/20  ip校验,敏感词校验,频率校验结果汇总 多线程跑单个校验项 汇总结果
        List<CompletableFuture<CheckResutlDO>> completableFutureList = new ArrayList<>(list.size());
        list.forEach(busType->{
            //自定义线程池
            CompletableFuture<CheckResutlDO> yidunCheckPictureCompletableFuture = CompletableFuture.supplyAsync(()->checkHandlerAdapterMap.get(busType).doChecck(checkRequestDO),executor);
            completableFutureList.add(yidunCheckPictureCompletableFuture);
        });
        List<CheckResutlDO> pictureAllResultList = new ArrayList<>();
        completableFutureList.stream().map(CompletableFuture::join).forEach(partResult -> pictureAllResultList.add(partResult));
        //各个检测项目 根据不同的策略返回不同的结果 1. 模拟数据库配置的合并策略枚举值
        return ConsolidationResultStrategyEnum.getByCode(1).consolidationResult(pictureAllResultList);

    }

    @PostConstruct
    public void initCheckHandlerAdapterMap(){
        Arrays.stream(FilterProjectsEnum.values()).forEach(
                filterProjectsEnum -> {
                    CheckHandlerAdapter bean = (CheckHandlerAdapter)applicationContext.getBean(filterProjectsEnum.getHandlerName());
                    checkHandlerAdapterMap.put(filterProjectsEnum.getFilterCode(),bean);
                }
        );
    }
}
