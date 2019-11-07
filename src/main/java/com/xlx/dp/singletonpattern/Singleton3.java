package com.xlx.dp.singletonpattern;

/**
 * 懒汉模式线程安全(加锁)
 *
 * @author xielx at 2019/11/7 14:08
 */
public class Singleton3 {
    
    /**
     * 全局私有对象
     */
    private static Singleton3 singleton;
    
    /**
     * 私有构造
     */
    private Singleton3() {
    }
    
    /**
     * 提供一个共有方法,创建实例 方法加锁
     *
     * @return 实例
     */
    public static synchronized Singleton3 getSingleton() {
        
        if (singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }
    
    
    /**
     * 创建类实例,代码块加锁
     * @return 实例
     */
    public static Singleton3 getSingletonBlock() {
        synchronized (Singleton3.class) {
            if (singleton == null) {
                singleton = new Singleton3();
            }
        }
        return singleton;
    }
}
