package com.xlx.dp.strategypattern.strategy;


import com.xlx.dp.strategypattern.strategy.discount.CashReturn;
import com.xlx.dp.strategypattern.strategy.discount.DiscountCash;
import com.xlx.dp.strategypattern.strategy.discount.NormalCash;

/**
 * 策略维护类
 *
 * @author xielx at 2019/10/24 15:08
 */
public class StrategyContext {
   private AbstractStrategy cash = null;
    
    public  StrategyContext(String type){
        switch (type){
            case "正常":
                cash = new NormalCash();
                break;
            case "打8折":
                cash = new DiscountCash(0.8d);
                break;
            case "返利":
                cash = new CashReturn(300d,100d);
                break;
            default:
                System.out.println("请输入正确的选项");
                cash = null;
        }
    }
 
    
    public double getMoney(double cost){
        return cash.acceptCash(cost);
    }
}
