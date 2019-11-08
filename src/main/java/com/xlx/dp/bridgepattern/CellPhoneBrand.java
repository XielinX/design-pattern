package com.xlx.dp.bridgepattern;

/**
 * 手机品牌
 *
 * @author xielx at 2019/11/8 15:09
 */
public abstract class CellPhoneBrand {
    
    /**
     * 手机品牌名称
     */
    protected String name;
    
    /**
     * 手机软件,使用组合关系(has)
     */
    protected SoftPhone softPhone;
    
    public void setSoftPhone(SoftPhone softPhone) {
        this.softPhone = softPhone;
    }
    
    public CellPhoneBrand(String name){
        this.name = name;
    }
    
    
    /**
     * 运行软件
     */
    protected abstract void run();
}
