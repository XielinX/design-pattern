package com.xlx.dp.memento;

/**
 * 备忘录模式测试
 *
 * @author xielx at 2019/11/5 21:15
 */
public class MementoTest {
    
    public static void main(String[] args) {
        
        // 大战前
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.stateDisplay();
        
        // 先保存
        RoleStateCreator roleStateCreator = new RoleStateCreator();
        roleStateCreator.setRoleMemento(gameRole.saveRoleMemento());
        
        
        // 大战
        gameRole.fight();
        gameRole.stateDisplay();
        
        // 恢复原档
        gameRole.recoveryRoleMemento(roleStateCreator.getRoleMemento());
        gameRole.stateDisplay();
    }
}
