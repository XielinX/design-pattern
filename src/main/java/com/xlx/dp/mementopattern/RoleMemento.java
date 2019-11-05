package com.xlx.dp.mementopattern;

/**
 * 备忘录
 *
 * @author xielx at 2019/11/5 21:03
 */
public class RoleMemento {
    
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
    
    
    public RoleMemento(Integer hp, Integer at, Integer de) {
        this.hp = hp;
        this.at = at;
        this.de = de;
    }
    
    public Integer getHp() {
        return hp;
    }
    
    public void setHp(Integer hp) {
        this.hp = hp;
    }
    
    public Integer getAt() {
        return at;
    }
    
    public void setAt(Integer at) {
        this.at = at;
    }
    
    public Integer getDe() {
        return de;
    }
    
    public void setDe(Integer de) {
        this.de = de;
    }
}
