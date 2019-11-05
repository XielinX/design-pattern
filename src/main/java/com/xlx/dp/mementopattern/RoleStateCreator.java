package com.xlx.dp.mementopattern;

/**
 * 角色存档管理
 *
 * @author xielx at 2019/11/5 21:14
 */
public class RoleStateCreator {
    
    private RoleMemento roleMemento;
    
    
    
    public RoleMemento getRoleMemento() {
        return roleMemento;
    }
    
    public void setRoleMemento(RoleMemento roleMemento) {
        this.roleMemento = roleMemento;
    }
    
    
}
