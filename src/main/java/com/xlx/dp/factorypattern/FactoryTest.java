package com.xlx.dp.factorypattern;

import java.math.BigDecimal;

/**
 * 应用场景测试
 *
 * 总结:
 * 如果需要增加计算类型如,开平方,立方,需要增加实现子类
 * @author xielx at 2019/10/24 11:55
 */
public class FactoryTest {
    
    public static void main(String[] args) {
        String op = "+";
        AbstractOperation operation = OperationFactory.createOperation(op);
        operation.setNum1(BigDecimal.valueOf(3.5));
        operation.setNum2(BigDecimal.valueOf(4.2));
        double result = operation.getResult();
        System.out.println("["+ op + "]计算结果:result=" + result);
    }
}
