package com.xlx.dp.strategy.strategy;

/**
 * 测试
 *
 * @author xielx at 2019/10/24 15:15
 */
public class StrategyTest {
    
    public static void main(String[] args) {
        StrategyContext context = new StrategyContext("返利");
        double money = context.getMoney(300);
        System.out.println("返利,应付:" + money);
    }
}
