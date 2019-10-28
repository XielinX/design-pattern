package com.xlx.dp.observerpattern;

/**
 * 抽象通知者接口(通风报信的人)
 *
 * @author xielx at 2019/10/28 15:18
 */
public interface Subject {
    
    
    /**
     * 增加通知谁
     */
    void attach(Observer observer);
    
    /**
     * 不通知谁
     */
    void unattach(Observer observer);
    
    /**
     * 通风报信
     */
    void notice();
    
}
