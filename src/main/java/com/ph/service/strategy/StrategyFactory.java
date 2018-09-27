package com.ph.service.strategy;

import com.ph.common.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author:   lzy
 * Date:     2018-09-10 15:32
 * Description:  策略执行工厂类
 **/
@Component
public class StrategyFactory {
	private static Logger logger = LoggerFactory.getLogger(StrategyFactory.class);

    @Autowired
    private ExecuteStrategy executeStrategy;
    @Autowired
    private ExecuteStrategyFlow executeStrategyFlow;

    public ExecuteStrategy getInstance(String strategyType) {
        if (strategyType.toUpperCase().equals(Product.STRATEGY_TYPE_FLOW)) {
            return executeStrategyFlow;
        } else{
            return executeStrategy;
        }
    }
}
