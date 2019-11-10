package com.xlx.dp.mediatorpattern;

/**
 * 国家抽象类
 *
 * @author xielx at 2019/11/10 19:35
 */
public abstract class Country {
    
    // 联合国
    protected UnionNation un;
    
    public Country(UnionNation unionNation){
        this.un = unionNation;
    }
    
}
