package com.xlx.dp.abstractfactorymethod.entity;

/**
 * 用户
 *
 * @author xielx at 2019/11/1 15:08
 */
public class User {
    
    private Long userId;
    
    /**
     * 用户名
     */
    private String userName;
    /**
     * 年龄
     */
    private Integer age;
    
    
    public User() {}
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
}
