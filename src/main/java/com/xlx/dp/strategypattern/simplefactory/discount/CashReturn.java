package com.xlx.dp.strategypattern.simplefactory.discount;

import com.xlx.dp.strategypattern.simplefactory.AbstractCash;

/**
 * 满几返利
 * @author xielx at 2019/10/24 14:11
 */
public class CashReturn extends AbstractCash {
    
    /**
     * 消费金额
     */
    private Double conditionMoney = 0.0;
    /**
     * 返利金额
     */
    private Double returnMoney = 0.0;
    
    
    public CashReturn(double cost,double back){
        this.conditionMoney = cost;
        this.returnMoney = back;
    }
    
    
    @Override
    public double getMoney(double money) {
        double result = money;
        if (money > conditionMoney){
            result = money - returnMoney;
        }
        return result;
    }
}
