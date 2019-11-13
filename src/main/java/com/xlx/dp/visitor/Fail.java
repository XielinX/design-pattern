package com.xlx.dp.visitor;

/**
 * 失败状态
 *
 * @author xielx at 2019/11/13 20:56
 */
public class Fail extends State {
    
    
    @Override
    protected void getMaleState(Person person) {
        System.out.println(person.getClass().getName() + "******失败时: 后有一个默默付出的女人");
    }
    
    @Override
    protected void getFemaleState(Person person) {
        System.out.println(person.getClass().getName() + "********失败时: 后有一个默默付出的女人");
    }
}
