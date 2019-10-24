package com.xlx.dp.strategy.factory;

/**
 * 收银工厂
 *
 * @author xielx at 2019/10/24 14:24
 */
public class CachFacotory {
    
    
    /**
     * 收银工厂
     * @param type 优惠类型
     * @return 抽象父类
     */
    public static AbstractCash getTotalMoney(String type){
        AbstractCash cach = null;
        
        switch (type){
            case "正常":
                cach = new NormalCash();
                break;
            case "打8折":
                cach = new DiscountCach(0.8);
                break;
            case "返利":
                cach = new CashReturn(300,100);
                break;
            default:
                System.out.println("请输入正确的选项");
        }
        return cach;
    }
}
