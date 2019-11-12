package com.xlx.dp.flyweightpattern;

/**
 * 网站的抽象类
 *
 * @author xielx at 2019/11/12 14:44
 */
public abstract class WebSite {
    
    /**
     * 使用对象
     * @param user 用户
     */
    protected abstract void use(User user);
}
