package com.jiang.designpattern.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 10:31 上午
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public Object test(){
        Map<String,Object> map = new HashMap<>();
        map.put("msg","success");
        map.put("code",10);
        return map;
    }
}
