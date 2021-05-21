package com.jiang.designpattern.service.impl;

import com.jiang.designpattern.model.request.CheckRequestDO;
import com.jiang.designpattern.model.response.CheckResutlDO;
import com.jiang.designpattern.service.CheckStrageService;
import com.jiang.designpattern.service.FilterCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 10:38 上午
 */
@Service
public class FilterCheckServiceImpl implements FilterCheckService {


    @Autowired
    private CheckStrageService checkStrageService;



    /**
     * 校验结果
     * @param checkRequestDO
     * @return
     */
    @Override
    public CheckResutlDO check(CheckRequestDO checkRequestDO) {
        //根据业务线唯一标识查询配置的全部过滤项目
        List<Integer> list = Arrays.asList(1,2); //模拟从数据库查询到的全部检测项目的标识
        return checkStrageService.doCheck(list,checkRequestDO);
    }
}
