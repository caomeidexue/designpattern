package com.jiang.designpattern.model.request;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 10:36 上午
 */
public class CheckRequestDO {


    /**
     * 业务线标识
     */
    private String busId;

    /**
     * 检测内容
     */
    private String content;

    /**
     * 检测ip
     */
    private String ip;


    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
