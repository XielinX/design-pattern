package com.xlx.dp.observer;

/**
 * 员工C
 *
 * @author xielx at 2019/10/28 16:48
 */
public class EmployeeC extends Observer{
    
   
    public EmployeeC(String name,Subject subject){
        super(name,subject);
        
    }
    
    @Override
    protected void acceptAndAction() {
        System.out.println("收到通知," +  super.name + "开始工作");
    }
}
