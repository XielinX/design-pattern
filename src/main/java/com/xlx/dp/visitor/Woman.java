package com.xlx.dp.visitor;

/**
 * 女人
 *
 * @author xielx at 2019/11/13 20:29
 */
public class Woman extends Person {
    
    
    @Override
    protected void accept(State state) {
        state.getFemaleState(this);
    }
}
