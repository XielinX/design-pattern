package com.xlx.dp.builder;

/**
 * 构建者
 *
 * @author xielx at 2019/10/27 20:10
 */
public abstract class AbstractBuilder {
    
    /**
     * 构建零件A
     */
    protected abstract void buildPartA();
    
    /**
     * 构建零件B
     */
    protected abstract void buildPartB();
    
    /**
     * 组装产品
     * @return 完整产品
     */
    protected abstract Product createProduct();
}
