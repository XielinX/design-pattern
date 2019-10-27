package com.xlx.dp.builderpattern;

/**
 * 玩具枪
 *
 * @author xielx at 2019/10/27 20:18
 */
public class ToyGunBuilder extends AbstractBuilder {
    
    Product hangGun = new Product();
    
    @Override
    protected void buildPartA() {
        hangGun.addPart("玩具枪");
    }
    
    @Override
    protected void buildPartB() {
        hangGun.addPart("玩具枪子弹");
    }
    
    @Override
    protected Product createProduct() {
        return hangGun;
    }
}
