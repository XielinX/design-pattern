package com.xlx.dp.singletonpattern;

/**
 * 双层校验锁
 *
 * @author xielx at 2019/11/7 14:08
 */
public class Singleton4 {
    
    /**
     * 全局私有对象
     */
    private static Singleton4 singleton;
    
    /**
     * 私有构造
     */
    private Singleton4(){}
    
    /**
     * 提供一个共有方法,创建实例,双重检验
     * @return 实例
     */
    public static Singleton4 getSingleton(){
        if (singleton == null) {
            synchronized (Singleton4.class){
                if (singleton == null){
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
