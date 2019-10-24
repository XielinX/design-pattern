package com.xlx.dp.decoratepattern;

/**
 * 服饰类(Decorator)
 *
 * @author xielx at 2019/10/24 19:13
 */
public class Finery extends Person {
    
    /**
     * 谁
     */
    private Person person;
    
    /**
     * 打扮人初始化
     * @param component person
     */
    public void decoratePerson(Person component){
        this.person = component;
    }
    
    /**
     * 重写show方法:谁打扮,展示谁
     */
    @Override
    public void show() {
        if (person != null){
            person.show();
        }
        
    }
}
