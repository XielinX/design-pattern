package com.xlx.dp.singletonpattern;

/**
 * 恶汉模式
 *
 * @author xielx at 2019/11/7 14:08
 */
public class Singleton2 {
    
    /**
     * 全局私有对象
     */
    private static Singleton2 singleton = new Singleton2();
    
    /**
     * 私有构造
     */
    private Singleton2(){}
    
    /**
     * 提供一个共有方法,创建实例
     * @return 实例
     */
    public static Singleton2 getSingleton(){
           return  singleton;
    }
}
