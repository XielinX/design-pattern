package com.xlx.dp.strategy.strategy;

/**
 * 策略类
 * 问题: 商场收银
 *     正常收银
 *     打折
 *     满几返利
 * @author xielx at 2019/10/24 13:58
 */
public abstract class AbstractStrategy {
    
    /**
     * 提供不同实现的方式
     */
    protected abstract double acceptCash(double cost);
}
