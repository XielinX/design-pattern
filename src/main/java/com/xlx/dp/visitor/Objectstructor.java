package com.xlx.dp.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象显示
 *
 * @author xielx at 2019/11/13 21:02
 */
public class Objectstructor {
    
 
    List<Person> list = new ArrayList<>(10);
    
    // 增加
    public void addPerson(Person person){
        list.add(person);
    }
    
    // 减少
    public void removePerson(Person person){
        list.remove(person);
    }
    
    /**
     * 展示
     * @param state 状态
     */
    public void display(State state){
        list.forEach(person -> person.accept(state));
    }
}
