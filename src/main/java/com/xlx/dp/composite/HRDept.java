package com.xlx.dp.composite;

/**
 * 行政部门
 *
 * @author xielx at 2019/11/6 20:14
 */
public class HRDept extends Company {
    
    public HRDept(String name){
        super(name);
    }
    
    @Override
    protected void add(Company c) {
        System.out.println("无法扩展");
    }
    
    @Override
    protected void remove(Company c) {
        System.out.println("无法解散");
    }
    
    @Override
    protected void display(int depth) {
        System.out.println("-" + name);
    }
    
    @Override
    protected void duty() {
        System.out.println("员工人事");
    }
}
