package com.xlx.dp.abstractfactorymethod.entity;

/**
 * 部门类
 *
 * @author xielx at 2019/11/1 15:10
 */
public class Department {
    
    
    private Long deptId;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 部门地址
     */
    private String deptAddress;
    
    public Long getDeptId() {
        return deptId;
    }
    
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
    
    public String getDeptName() {
        return deptName;
    }
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    public String getDeptAddress() {
        return deptAddress;
    }
    
    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }
}
