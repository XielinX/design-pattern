package com.xlx.dp.abstractfactorymethod.IUserImpl;

import com.xlx.dp.abstractfactorymethod.IUser;
import com.xlx.dp.abstractfactorymethod.entity.User;

/**
 * access数据库操作实例
 *
 * @author xielx at 2019/11/1 15:16
 */
public class AccessUser implements IUser {
    
    @Override
    public void insertUser(User user) {
        System.out.println("新增用户");
    }
    
    @Override
    public void deleteUser(Long userId) {
        System.out.println("删除用户");
    }
}
