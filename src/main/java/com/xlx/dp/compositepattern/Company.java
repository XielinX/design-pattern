package com.xlx.dp.compositepattern;

/**
 * 公司
 *
 * @author xielx at 2019/11/6 19:33
 */
public abstract class Company {
    
    /**
     * 名称
     */
    protected String name;
    
    /**
     *
     * @param name 公司/部门名称
     */
    public Company(String name) {
        this.name = name;
    }
    
    /**
     * 公司扩展
     * @param c 公司/部门
     */
    protected abstract void add(Company c);
    
    /**
     * 解散
     * @param c 公司/部门
     */
    protected abstract void remove(Company c);
    
    /**
     * 展示
     * @param depth 节点
     */
    protected abstract void display(int depth);
    
    /**
     * 职能
     */
    protected abstract void duty();
}
