package com.jiang.designpattern.controller;

import com.jiang.designpattern.model.request.CheckRequestDO;
import com.jiang.designpattern.model.response.CheckResutlDO;
import com.jiang.designpattern.service.FilterCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 10:34 上午
 */
@RestController
public class FilterAdapterController {

    @Autowired
    private FilterCheckService filterCheckService;



    @RequestMapping("/check")
    public  Object filterObject(@RequestBody CheckRequestDO checkRequestDO){
        CheckResutlDO checkResutlDO =  filterCheckService.check(checkRequestDO);
        return checkResutlDO;
    }
}
