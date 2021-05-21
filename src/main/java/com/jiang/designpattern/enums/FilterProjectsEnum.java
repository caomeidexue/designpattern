package com.jiang.designpattern.enums;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/20 10:45 上午
 */
public enum FilterProjectsEnum {

    /**
     * 检测ip
     */
    IPCHCKER(1,"检测ip服务","ipCheckHandlerAdapter"),
    /**
     * 检测敏感词
     */
    SENSITIVECHCKER(2,"敏感词检测服务","contentCheckHandlerAdapter");

    private Integer filterCode;

    private String desc;

    private String handlerName;

    private FilterProjectsEnum(Integer filterCode, String desc, String handlerName) {
        this.filterCode = filterCode;
        this.desc = desc;
        this.handlerName = handlerName;
    }


    public Integer getFilterCode() {
        return filterCode;
    }

    public void setFilterCode(Integer filterCode) {
        this.filterCode = filterCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }
}
