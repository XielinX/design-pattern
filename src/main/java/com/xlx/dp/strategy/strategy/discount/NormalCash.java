package com.xlx.dp.strategy.strategy.discount;

import com.xlx.dp.strategy.strategy.AbstractStrategy;

/**
 * 正常收费
 *
 * @author xielx at 2019/10/24 14:50
 */
public class NormalCash extends AbstractStrategy {
    
    
    @Override
    protected double acceptCash(double cost) {
        return cost;
    }
}
