package com.xlx.dp.abstractfactorymethod.IFactoryImpl;

import com.xlx.dp.abstractfactorymethod.IFactory;
import com.xlx.dp.abstractfactorymethod.IUser;
import com.xlx.dp.abstractfactorymethod.IUserImpl.SQLServerUser;

/**
 * IUser接口的实现类SQLServerUser的实例化抽象
 * @author xielx at 2019/11/1 15:44
 */
public class SQLServerFactory implements IFactory {
    
    @Override
    public IUser createUser() {
        return new SQLServerUser();
    }
}
