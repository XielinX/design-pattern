package com.xlx.dp.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 子公司
 *
 * @author xielx at 2019/11/6 19:56
 */
public class ChildCompany extends Company {
   
    List<Company> child = new ArrayList<>(16);
    
    
    public ChildCompany(String name){
        super(name);
    }
    
    @Override
    protected void add(Company c) {
        child.add(c);
    }
    
    @Override
    protected void remove(Company c) {
        child.remove(c);
    }
    
    @Override
    protected void display(int depth) {
        System.out.println("-" + name);
        child.forEach(company -> company.display(depth + 2));
    }
    
    @Override
    protected void duty() {
        child.forEach(company -> company.duty());
    }
}
