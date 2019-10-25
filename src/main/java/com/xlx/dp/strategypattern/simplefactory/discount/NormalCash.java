package com.xlx.dp.strategypattern.simplefactory.discount;

import com.xlx.dp.strategypattern.simplefactory.AbstractCash;

/**
 * 正常收费
 *
 * @author xielx at 2019/10/24 14:03
 */
public class NormalCash extends AbstractCash {
    
    /**
     * 正常和打折收费
     * @param money
     * @return
     */
    @Override
    public double getMoney(double money) {
        return money;
    }
}
