package com.xlx.dp.observerpattern;

/**
 * 抽象观察者
 *   抽取共同特征
 *
 * @author xielx at 2019/10/28 16:00
 */
public abstract class Observer {
    
    
    
    protected String name;
    protected Subject subject;
    
    /**
     * 实例
     * @param name 观察者名字(员工名字)
     * @param subject 通风报信人
     */
    protected Observer(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }
    
    /**
     * 收到报信采取行动
     */
    protected abstract void acceptAndAction();
}
