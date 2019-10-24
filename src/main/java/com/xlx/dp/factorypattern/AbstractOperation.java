package com.xlx.dp.factorypattern;

import java.math.BigDecimal;

/**
 * 抽象计算类
 * 问题:两个数的计算(加减乘除...)
 *
 * 将共同部分提取抽象化
 * @author xielx at 2019/10/24 11:21
 */
public abstract class AbstractOperation {
    
    /**
     * 参数1
     */
    private BigDecimal num1 = BigDecimal.ZERO;
    /**
     * 参数2
     */
    private BigDecimal num2 = BigDecimal.ZERO;
    
    /**
     * 获取运算结果方法
     * @return 计算结果
     */
    public abstract double getResult();
    
    
    public BigDecimal getNum1() {
        return num1;
    }
    
    public void setNum1(BigDecimal num1) {
        this.num1 = num1;
    }
    
    public BigDecimal getNum2() {
        return num2;
    }
    
    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }
}
