package com.xlx.dp.visitor;

import com.xlx.dp.visitor.Person;

/**
 * 抽象化的状态类
 *
 * @author xielx at 2019/11/13 20:24
 */
public abstract class State {
    
    /**
     * 男性状态
     */
    protected abstract void getMaleState(Person person);
    
    /**
     * 女性状态
     */
    protected abstract void getFemaleState(Person person);
}
