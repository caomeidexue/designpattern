package com.jiang.designpattern.service.impl;

import com.jiang.designpattern.model.request.CheckRequestDO;
import com.jiang.designpattern.model.response.CheckResutlDO;
import com.jiang.designpattern.service.CheckHandlerAdapter;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 2:07 下午
 */
@Service
public class ContentCheckHandlerAdapter implements CheckHandlerAdapter {

    @Override
    public CheckResutlDO doChecck(CheckRequestDO checkRequestDO) {
        CheckResutlDO checkResutlDO = new CheckResutlDO();
        checkResutlDO.setContains(true);
        checkResutlDO.setResult("包含敏感词111");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return checkResutlDO;
    }
}
