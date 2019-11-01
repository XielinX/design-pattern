package com.xlx.dp.abstractfactorymethod.IUserImpl;

import com.xlx.dp.abstractfactorymethod.IUser;
import com.xlx.dp.abstractfactorymethod.entity.User;

/**
 * SQLServer数据库操作类
 *
 * @author xielx at 2019/11/1 15:18
 */
public class SQLServerUser implements IUser {
    
    @Override
    public void insertUser(User user) {
        System.out.println("新增部门");
    }
    
    @Override
    public void deleteUser(Long userId) {
        System.out.println("新增部门");
    }
}
