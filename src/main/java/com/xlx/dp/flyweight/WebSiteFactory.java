package com.xlx.dp.flyweight;

import java.util.Hashtable;

/**
 * 网站实例工厂
 *
 * @author xielx at 2019/11/12 15:29
 */
public class WebSiteFactory {
    
    // 存储对象
    private  Hashtable<String,WebSite> hashtable = new Hashtable<>(10);
    
    /**
     * 网站实例,集合里有新的实例,就创建,重复的对象不创建,直接从集合取出
     * @param name 网站类型
     * @return 网站实例
     */
    public  WebSite getWebSiteFactory(String name){
        if (!hashtable.contains(name)){
            hashtable.put(name,new ConcreteWebsite(name));
        }
        return hashtable.get(name);
    }
    
    /**
     * 实例个数
     * @return 数量
     */
    public Integer count(){
        return hashtable.size();
    }
    
}
