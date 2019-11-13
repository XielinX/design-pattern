package com.xlx.dp.visitor;

/**
 * 成功状态
 *
 * @author xielx at 2019/11/13 20:56
 */
public class Success extends State {
    
    
    @Override
    protected void getMaleState(Person person) {
        System.out.println(person.getClass().getName() + "------>成功时:背后有一个默默付出的女人");
    }
    
    @Override
    protected void getFemaleState(Person person) {
        System.out.println(person.getClass().getName() + "------>成功时:背后有一个默默付出的男人");
    }
}
