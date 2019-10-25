package com.xlx.dp.simplefactorypattern.calculate;

import com.xlx.dp.simplefactorypattern.AbstractOperation;

import java.math.BigDecimal;

/**
 * 加法
 *
 * @author xielx at 2019/10/24 11:28
 */
public class OperationAdd extends AbstractOperation {
    
    /**
     * 重写父类计算方法
     * @return double结果
     */
    @Override
    public double getResult() {
        BigDecimal num1 = getNum1();
        BigDecimal num2 = getNum2();
        return num1.add(num2).doubleValue();
    }
}
