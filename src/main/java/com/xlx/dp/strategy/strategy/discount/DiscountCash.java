package com.xlx.dp.strategy.strategy.discount;

import com.xlx.dp.strategy.strategy.AbstractStrategy;

/**
 * 打折
 *
 * @author xielx at 2019/10/24 14:56
 */
public class DiscountCash extends AbstractStrategy {
    
    private Double discount = 0.0;
    
    
    public DiscountCash(Double discount){
        this.discount = discount;
    }
    
    @Override
    protected double acceptCash(double cost) {
        
        return cost * discount;
    }
}
