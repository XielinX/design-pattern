package com.xlx.dp.singleton;

/**
 * 懒汉模式
 *
 * @author xielx at 2019/11/7 14:08
 */
public class Singleton {
    
    /**
     * 全局私有对象
     */
    private static Singleton singleton;
    
    /**
     * 私有构造
     */
    private  Singleton(){}
    
    /**
     * 提供一个共有方法,创建实例
     * @return 实例
     */
    public static Singleton getSingleton(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
