package com.xlx.dp.abstractfactorymethod;

import com.xlx.dp.abstractfactorymethod.IFactoryImpl.AccessFactory;
import com.xlx.dp.abstractfactorymethod.IUserImpl.AccessUser;
import com.xlx.dp.abstractfactorymethod.entity.Department;
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
        Department dept = new Department();
        //AccessDepartment accessDB = new AccessDepartment();
        //accessDB.insertDepartment(dept);
    }
    
    
    /**
     * 抽象化工厂
     */
    public void testAbstractFactory(){
        User user = new User();
        IUser accessFactory = new AccessFactory().createUser();
        accessFactory.insertUser(user);
    }
    
    
    /**
     * 简单工厂模式简化new xxxFactory()
     */
    public void testAbstractFactoryWithFactory(){
        User user = new User();
        IUser accessUser = DataAccess.createUser();
        accessUser.insertUser(user);
    }
    
    /**
     * 使用反射
     */
    public void testAbstractFactoryWithFactory2(){
        User user = new User();
        IUser accessUser = null;
        try {
            accessUser = DataAccess.createUserByReflection();
            accessUser.insertUser(user);
        } catch (ClassNotFoundException  | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
    
    
}
