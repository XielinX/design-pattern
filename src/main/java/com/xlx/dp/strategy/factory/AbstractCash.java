package com.xlx.dp.strategy.factory;

/**
 * 收银抽象类
 * 问题:
 *   商场收银
 *      正常收银
 *      打折
 *      满几返利
 * @author xielx at 2019/10/24 14:00
 */
public abstract class AbstractCash {
    
    /**
     * 收钱方法
     * @return 总金额
     */
    public abstract double getMoney(double money);
}
