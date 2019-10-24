package com.xlx.dp.strategy.factory;

/**
 * 正常收费
 *
 * @author xielx at 2019/10/24 14:03
 */
public class DiscountCach extends AbstractCash {
    
    /**
     * 折扣
     */
    private Double discount = 1.0;
    
    
    /**
     * 收费实例
     * @param discount  正常,折扣=1.0;打折,输入打折折扣
     */
    public DiscountCach(double discount){
        this.discount = discount;
    }
    
    /**
     * 正常和打折收费
     * @param money
     * @return
     */
    @Override
    public double getMoney(double money) {
        return money * discount;
    }
}
