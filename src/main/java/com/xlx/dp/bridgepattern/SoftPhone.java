package com.xlx.dp.bridgepattern;

/**
 * 手机软件
 *
 * @author xielx at 2019/11/8 14:36
 */
public abstract class SoftPhone {
    
    /**
     * 软件名称
     */
    protected String name;
    
    public SoftPhone(String name){
        this.name = name;
    }
    
    /**
     * 运行软件
     */
    protected abstract void run();
}
