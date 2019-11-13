package com.xlx.dp.adapter;

/**
 * 前锋
 *
 * @author xielx at 2019/11/5 14:13
 */
public class ForwordPlayer extends Player {
    
    
    public ForwordPlayer(String name){
        super(name);
    }
    
    @Override
    protected void attack() {
        System.out.println("前锋:" + super.getName() + "进攻");
    }
    
    @Override
    protected void defense() {
        System.out.println("前锋:" + super.getName() + "防守");
    }
}
