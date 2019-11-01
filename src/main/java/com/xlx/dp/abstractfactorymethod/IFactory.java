package com.xlx.dp.abstractfactorymethod;

/**
 * 将IUser接口实现类的实例化操作抽象
 *  new AccessUserImpl();
 * @author xielx at 2019/11/1 15:40
 */
public interface IFactory {
    
    /**
     * 创建IUser接口的实例
     * @return IUserImpl 多态
     */
    IUser createUser();
}
