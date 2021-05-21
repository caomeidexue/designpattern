package com.jiang.designpattern.service.impl;

import com.jiang.designpattern.mapper.IpBlackPollMapper;
import com.jiang.designpattern.model.request.CheckRequestDO;
import com.jiang.designpattern.model.response.CheckResutlDO;
import com.jiang.designpattern.service.CheckHandlerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 2:06 下午
 */
@Service
public class IpCheckHandlerAdapter implements CheckHandlerAdapter {




    @Override
    public CheckResutlDO doChecck(CheckRequestDO checkRequestDO) {
        CheckResutlDO checkResutlDO = new CheckResutlDO();
        checkResutlDO.setContains(false);
        checkResutlDO.setResult("ip检测结果");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return checkResutlDO;
    }
}
