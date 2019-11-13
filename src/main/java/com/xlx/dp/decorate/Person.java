package com.xlx.dp.decorate;

/**
 * 装饰人(ConcreteComponent)
 * 问题:
 *   人的套装
 * @author xielx at 2019/10/24 19:09
 */
public class Person {
    
    // 打扮人
    private String name;
    
    public Person(){}
    
    public Person(String name){
        this.name = name;
    }
    
    
    /**
     * 展示
     */
    public void show(){
        System.out.println("装扮人:" + name);
    }
    
}
