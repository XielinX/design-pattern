package com.xlx.dp.strategypattern.simplefactory;

import com.xlx.dp.strategypattern.simplefactory.discount.CashReturn;
import com.xlx.dp.strategypattern.simplefactory.discount.DiscountCach;
import com.xlx.dp.strategypattern.simplefactory.discount.NormalCash;

/**
 * 收银工厂
 *
 * @author xielx at 2019/10/24 14:24
 */
public class CashFactory {
    
    
    /**
     * 收银工厂
     * @param type 优惠类型
     * @return 抽象父类
     */
    public static AbstractCash getTotalMoney(String type){
        AbstractCash cash = null;
        
        switch (type){
            case "正常":
                cash = new NormalCash();
                break;
            case "打8折":
                cash = new DiscountCach(0.8);
                break;
            case "返利":
                cash = new CashReturn(300,100);
                break;
            default:
                System.out.println("请输入正确的选项");
        }
        return cash;
    }
}
