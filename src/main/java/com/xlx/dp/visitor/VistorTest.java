package com.xlx.dp.visitor;

/**
 * 访问者测试
 *
 * @author xielx at 2019/11/13 21:06
 */
public class VistorTest {
    
    
    public static void main(String[] args) {
        
        Objectstructor objectstructor = new Objectstructor();
        // 人
        objectstructor.addPerson(new Man());
        objectstructor.addPerson(new Woman());
        
        // 加入状态
        objectstructor.display(new Success());
        objectstructor.display(new Fail());
    }
}
