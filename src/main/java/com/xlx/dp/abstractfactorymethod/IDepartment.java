package com.xlx.dp.abstractfactorymethod;


import com.xlx.dp.abstractfactorymethod.entity.Department;

/**
 * 数据库操作方法
 *
 * @author xielx at 2019/11/1 15:13
 */
public interface IDepartment {
    
    /**
     * 新增
     * @param user 部门
     */
    void insertDept(Department user);
    
    /**
     * 删除
     * @param deptId 部门id
     */
    void deleteDept(Long deptId);
}
