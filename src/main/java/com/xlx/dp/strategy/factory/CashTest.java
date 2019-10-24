package com.xlx.dp.strategy.factory;

/**
 * 测试
 *
 * @author xielx at 2019/10/24 14:38
 */
public class CashTest {
    
    
    public static void main(String[] args) {
    
        AbstractCash abstractCash = CachFacotory.getTotalMoney("打8折");
        double money = abstractCash.getMoney(100);
        System.out.println("打八折:" + money);
    }
}
