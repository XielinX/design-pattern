package com.xlx.dp.builder;

/**
 * 指导组装者
 *
 * @author xielx at 2019/10/27 20:20
 */
public class Director {
    
    /**
     * 玩具组装负责
     * @param builder 构建
     */
    public void construct(AbstractBuilder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
    
    
}
