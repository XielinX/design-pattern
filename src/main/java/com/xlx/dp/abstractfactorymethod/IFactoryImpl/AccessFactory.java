package com.xlx.dp.abstractfactorymethod.IFactoryImpl;

import com.xlx.dp.abstractfactorymethod.IFactory;
import com.xlx.dp.abstractfactorymethod.IUser;
import com.xlx.dp.abstractfactorymethod.IUserImpl.AccessUser;

/**
 * access实现类的工厂模式
 *
 * @author xielx at 2019/11/1 15:43
 */
public class AccessFactory implements IFactory {
    
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
