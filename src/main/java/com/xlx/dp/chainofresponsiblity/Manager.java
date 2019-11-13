package com.xlx.dp.chainofresponsiblity;

/**
 * 抽象的管理类
 *
 * @author xielx at 2019/11/9 16:25
 */
public abstract class Manager {
    
    protected String name;
    
    /**
     * 上级主管
     */
    protected Manager superior;
    
    
    public Manager(String name){
        this.name = name;
    }
    
    /**
     * 汇报请求
     * @param requester 请求者
     */
    public abstract void dealWithRequest(Requester requester);
    
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Manager getSuperior() {
        return superior;
    }
    
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }
}
