package com.xlx.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 前台美眉
 *
 * @author xielx at 2019/10/28 15:58
 */
public class FrontMM implements Subject {
    
    private String name;
    // 要通知的人
    List<Observer> observerList = new ArrayList<>();
    
    public FrontMM(String name){
        this.name = name;
    }
    
    /**
     * 通知方式
     */
    private String action;
    
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }
    
    
    
    @Override
    public void unattach(Observer observer) {
        observerList.remove(observer);
    }
    
    @Override
    public void notice() {
        System.out.println(getAction());
        observerList.forEach(observer -> observer.acceptAndAction());
    }
    
    public String getAction() {
        return action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
}
