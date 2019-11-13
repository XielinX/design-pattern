package com.xlx.dp.visitor;

/**
 * 抽象化的人
 *
 * @author xielx at 2019/11/13 20:22
 */
public abstract class Person {
    
    
    /**
     * 根据状态再行为
     * @param state 状态
     */
    protected abstract void accept(State state);
    
}
