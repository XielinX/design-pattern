package com.xlx.dp.builderpattern;

/**
 * 玩具产品
 *
 * @author xielx at 2019/10/27 20:16
 */
public class ToyBuilder extends AbstractBuilder {
    
    Product toy = new Product();
    
    @Override
    protected void buildPartA() {
        toy.addPart("可达鸭上身");
    }
    
    @Override
    protected void buildPartB() {
        toy.addPart("可达鸭下身");
    }
    
    @Override
    protected Product createProduct() {
        return toy;
    }
}
