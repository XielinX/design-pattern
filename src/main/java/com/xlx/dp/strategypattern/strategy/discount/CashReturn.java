package com.xlx.dp.strategypattern.strategy.discount;

import com.xlx.dp.strategypattern.strategy.AbstractStrategy;

/**
 * 返利
 *
 * @author xielx at 2019/10/24 14:59
 */
public class CashReturn extends AbstractStrategy {
    
    private Double condition = 0.0;
    
    private Double returnMoney = 0.0;
    
    
    public CashReturn(Double condition,Double returnMoney){
        this.condition = condition;
        this.returnMoney = returnMoney;
    }
    
    @Override
    protected double acceptCash(double cost) {
        return cost >= condition ? cost - Math.floor(cost / condition) * returnMoney : cost;
    }
}
