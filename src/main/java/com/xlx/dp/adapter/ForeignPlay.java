package com.xlx.dp.adapter;

/**
 * 外籍球员
 *
 * @author xielx at 2019/11/5 14:18
 */
public class ForeignPlay {
    
    private String name;
    
    
    
    public ForeignPlay(String name){
        this.name = name;
    }
    
    public void attack(){
        System.out.println("外籍球员进攻");
    }
    
    public void defense(){
        System.out.println("外籍球员防守");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
