package com.xlx.dp.facadepattern;

/**
 * 外观模式测试
 *
 * @author xielx at 2019/10/27 15:35
 */
public class FacadeTest {
    
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }
}
