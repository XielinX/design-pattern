package com.xlx.dp.simplefactorypattern;

import com.xlx.dp.simplefactorypattern.calculate.OperationAdd;
import com.xlx.dp.simplefactorypattern.calculate.OperationDiv;
import com.xlx.dp.simplefactorypattern.calculate.OperationMul;
import com.xlx.dp.simplefactorypattern.calculate.OperationSub;

/**
 * operation工厂类
 * 工厂模式: 使用单独的类/方法.来实现实例对象,省去单独的new
 * @author xielx at 2019/10/24 11:47
 */
public class OperationFactory {
    
    
    /**
     * 静态实例方法
     * op可以使用枚举代替
     * @param op 计算符号
     * @return 实例
     */
    public static AbstractOperation createOperation(String op){
        AbstractOperation operation = null;
        switch (op){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
            case "/":
                operation = new OperationDiv();
            default:
                System.out.println("请输入正确的操作符");
        }
        return operation;
    }
}
