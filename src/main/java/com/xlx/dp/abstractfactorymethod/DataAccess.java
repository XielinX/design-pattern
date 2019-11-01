package com.xlx.dp.abstractfactorymethod;

import com.xlx.dp.abstractfactorymethod.IUserImpl.AccessUser;
import com.xlx.dp.abstractfactorymethod.IUserImpl.SQLServerUser;
import com.xlx.dp.abstractfactorymethod.entity.User;

/**
 * 简单工厂模式简化new xxxFactory()
 * @author xielx at 2019/11/1 16:12
 */
public class DataAccess {
    
    private static final String SQLSERVER_DB = "SQLServer";
    private static final String ACCESS_DB = "Access";
    
    public static IUser createUser(){
        IUser user = null;
        switch (ACCESS_DB){
            case "SQLServer":
                user = new SQLServerUser();
                break;
            case "Access":
                user = new AccessUser();
                break;
            default:
                user = null;
        }
        return user;
    }
    
    public static IUser createUserByReflection() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        
        Class<?> aClass = Class.forName("com.xlx.dp.abstractfactorymethod.IUserImpl.AccessUser");
        AccessUser instance = (AccessUser) aClass.newInstance();
        return  instance;
    }
    /*public static IDepartment createDepartment(){
        IDepartment department = null;
        switch (DB){
            case "SQLServer":
                department = new SQLServerDepartment();
                break;
            case "Access":
                department = new AccessDepartment();
                break;
            default:
                department = null;
        }
        return department;
    }*/
}
