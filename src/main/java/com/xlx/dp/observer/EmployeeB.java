package com.xlx.dp.observer;

/**
 * 员工A
 *
 * @author xielx at 2019/10/28 16:09
 */
public class EmployeeB extends Observer{
    
    
    public EmployeeB(String name, Subject subject){
        super(name,subject);
    }
    
    @Override
    protected void acceptAndAction() {
        System.out.println("收到通知," +  super.name + "开始工作");
    }
}
