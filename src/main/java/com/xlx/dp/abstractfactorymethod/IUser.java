package com.xlx.dp.abstractfactorymethod;

import com.xlx.dp.abstractfactorymethod.entity.User;

/**
 * 数据库操作方法
 *
 * @author xielx at 2019/11/1 15:13
 */
public interface IUser {
    
    /**
     * 新增
     * @param user 用户
     */
    void insertUser(User user);
    
    /**
     * 删除
     * @param userId 用户
     */
    void deleteUser(Long userId);
}
