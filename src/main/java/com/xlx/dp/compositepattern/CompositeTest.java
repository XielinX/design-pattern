package com.xlx.dp.compositepattern;

/**
 * 组合模式测试
 *
 * @author xielx at 2019/11/6 20:20
 */
public class CompositeTest {
    
    public static void main(String[] args) {
        // 总公司
        ChildCompany root = new ChildCompany("北京总公司");
        root.add(new HRDept("行政部"));
        root.add(new FinanceDept("财务部"));
        
        // 子公司
        ChildCompany sub = new ChildCompany("上海分公司");
        sub.add(new HRDept("上海分公司行政部"));
        sub.add(new HRDept("上海分公司财务部"));
        
        root.add(sub);
    
        System.out.println("***结构图");
        root.display(1);
    
        System.out.println("****职责");
        root.duty();
        
        
    }
}
