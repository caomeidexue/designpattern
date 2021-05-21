package com.jiang.designpattern.model.response;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 10:40 上午
 */
public class CheckResutlDO {

    /**
     * 是否含有结果
     */
    private boolean  contains;

    /**
     * 过滤结果
     */
    private String result;

    public boolean isContains() {
        return contains;
    }

    public void setContains(boolean contains) {
        this.contains = contains;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
