package com.xlx.dp.memento;

/**
 * 游戏角色
 *
 * @author xielx at 2019/11/5 19:41
 */
public class GameRole {
    
    /**
     * 生命力
     */
    private Integer hp;
    
    /**
     * 攻击力
     */
    private Integer at;
    
    /**
     * 防御力
     */
    private Integer de;
    
    
    
    /**
     * 初始化
     */
    public void init(){
        this.hp = 100;
        this.at = 100;
        this.de = 100;
    }
    
    /**
     * 大战
     */
    public void fight(){
        this.hp = 0;
        this.at = 0;
        this.de = 0;
    }
    
    /**
     * 存档
     * @return 备忘录
     */
    public RoleMemento saveRoleMemento(){
        return new RoleMemento(hp,at,de);
    }
    
    
    /**
     * 恢复存档
     * @param roleMemento 备忘录
     */
    public void recoveryRoleMemento(RoleMemento roleMemento){
        this.hp = roleMemento.getHp();
        this.at = roleMemento.getAt();
        this.de = roleMemento.getDe();
    }
    
    /**
     * 状态查看
     */
    public void stateDisplay(){
        System.out.println("当前状态:");
        System.out.println("生命力:" + hp);
        System.out.println("攻击力:" + at);
        System.out.println("防御力:" + de);
    }
    
    
}
