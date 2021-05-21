package com.jiang.designpattern.service;

import com.jiang.designpattern.model.response.CheckResutlDO;

import java.util.List;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/21 3:12 下午
 */
public interface ConsolidationResultService {

    CheckResutlDO consolidationResult(List<CheckResutlDO> checkResutlDOList);
}
