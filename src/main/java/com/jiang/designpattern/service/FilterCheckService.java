package com.jiang.designpattern.service;

import com.jiang.designpattern.model.request.CheckRequestDO;
import com.jiang.designpattern.model.response.CheckResutlDO;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 10:38 上午
 */
public interface FilterCheckService {
    CheckResutlDO check(CheckRequestDO checkRequestDO);
}
