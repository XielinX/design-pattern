package com.xlx.dp.adapter;

/**
 * 球队
 *
 * @author xielx at 2019/11/5 14:11
 */
public abstract class Player {
    
    /**
     * 球员类型
     */
    private String name;
    
    public String getName() {
        return name;
    }
    
    protected Player(String name){
        this.name = name;
    }
    
    /**
     * 进攻
     */
    protected abstract void attack();
    
    /**
     * 防守
     */
    protected abstract void defense();
}
