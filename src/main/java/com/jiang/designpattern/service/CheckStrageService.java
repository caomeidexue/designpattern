package com.jiang.designpattern.service;

import com.jiang.designpattern.model.request.CheckRequestDO;
import com.jiang.designpattern.model.response.CheckResutlDO;

import java.util.List;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 10:56 上午
 */
public interface CheckStrageService {
    CheckResutlDO doCheck(List<Integer> list, CheckRequestDO checkRequestDO);
}
