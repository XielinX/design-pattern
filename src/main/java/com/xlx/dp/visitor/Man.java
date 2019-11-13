package com.xlx.dp.visitor;

/**
 * 男人
 *
 * @author xielx at 2019/11/13 20:29
 */
public class Man extends Person {
    
    
    @Override
    protected void accept(State state) {
        state.getMaleState(this);
    }
}
