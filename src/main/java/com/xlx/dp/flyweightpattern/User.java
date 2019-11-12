package com.xlx.dp.flyweightpattern;

/**
 * 用户
 *
 * @author xielx at 2019/11/12 15:23
 */
public class User {
    
    private String name;
    
    public User(String name){
        this.name = name;
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
