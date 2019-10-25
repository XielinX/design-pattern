package com.xlx.dp.simplefactorypattern.calculate;

import com.xlx.dp.simplefactorypattern.AbstractOperation;

import java.math.BigDecimal;

/**
 * 减法
 *
 * @author xielx at 2019/10/24 11:28
 */
public class OperationSub extends AbstractOperation {
    
    /**
     * 重写父类计算方法
     * @return double结果
     */
    @Override
    public double getResult() {
        BigDecimal num1 = getNum1();
        BigDecimal num2 = getNum2();
        return num1.subtract(num2).doubleValue();
    }
}
