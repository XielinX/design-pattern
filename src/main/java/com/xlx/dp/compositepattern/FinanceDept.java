package com.xlx.dp.compositepattern;

/**
 * 财政部
 *
 * @author xielx at 2019/11/6 20:18
 */
public class FinanceDept extends Company{
    
    public FinanceDept(String name){
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
        System.out.println("财务处理");
    }
}
