package com.jiang.designpattern.enums;

import cn.hutool.core.util.RandomUtil;
import com.jiang.designpattern.model.response.CheckResutlDO;
import com.jiang.designpattern.service.ConsolidationResultService;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/5/21 3:10 下午
 * 合并结果集的策略
 */

public enum ConsolidationResultStrategyEnum implements ConsolidationResultService {
    /**
     * 随机返回
     */
    RANDOM(1,"随机返回"){
        @Override
        public CheckResutlDO consolidationResult(List<CheckResutlDO> checkResutlDOList) {
            //随机返回
            return checkResutlDOList.get(RandomUtil.randomInt(checkResutlDOList.size()));
        }
    },
    /**
     * 返回第一个结果
     */
    RETURNFIRST(2,"返回第一个"){
        @Override
        public CheckResutlDO consolidationResult(List<CheckResutlDO> checkResutlDOList) {
            return checkResutlDOList.get(0);
        }
    };

    private Integer strategyCode;

    private String  strategyDesc;

    ConsolidationResultStrategyEnum(Integer strategyCode, String strategyDesc) {
        this.strategyCode = strategyCode;
        this.strategyDesc = strategyDesc;
    }


    static Map<Integer, ConsolidationResultStrategyEnum> map = new HashMap<>();


    static {
        Arrays.stream(ConsolidationResultStrategyEnum.values()).forEach(item-> {
            map.put(item.strategyCode,item);
        });
    }




    public static ConsolidationResultStrategyEnum getByCode(Integer strategyCode){
        return map.get(strategyCode);
    }
}
