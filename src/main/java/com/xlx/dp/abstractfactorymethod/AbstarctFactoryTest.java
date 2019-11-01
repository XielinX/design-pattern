package com.xlx.dp.abstractfactorymethod;

import com.xlx.dp.abstractfactorymethod.IUserImpl.AccessUser;
import com.xlx.dp.abstractfactorymethod.entity.User;

/**
 * 测试
 *
 * @author xielx at 2019/11/1 15:20
 */
public class AbstarctFactoryTest {
    
    /**
     * 抽象出db操作类方法接口
     * 使用对应实现类完成
     */
    public void test1(){
        User user = new User();
        AccessUser accessDB = new AccessUser();
        accessDB.insertUser(user);
        
        // 部门
        
    }
}
