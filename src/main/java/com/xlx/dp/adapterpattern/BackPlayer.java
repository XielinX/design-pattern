package com.xlx.dp.adapterpattern;

/**
 * 后锋
 *
 * @author xielx at 2019/11/5 14:13
 */
public class BackPlayer extends Player {
    
    
    public BackPlayer(String name){
        super(name);
    }
    
    @Override
    protected void attack() {
        System.out.println("后锋:" + super.getName() + "进攻");
    }
    
    @Override
    protected void defense() {
        System.out.println("后锋:" + super.getName() + "防守");
    }
}
