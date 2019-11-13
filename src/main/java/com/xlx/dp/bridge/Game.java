package com.xlx.dp.bridge;

/**
 * 游戏
 *
 * @author xielx at 2019/11/8 15:07
 */
public class Game extends SoftPhone {
    
    public Game(String name){
        super(name);
    }
    
    @Override
    protected void run() {
        System.out.println("贪吃蛇开始运动~~~~");
    }
}
