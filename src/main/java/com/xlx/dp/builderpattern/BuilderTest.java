package com.xlx.dp.builderpattern;

/**
 * 构建模式测试
 *
 * @author xielx at 2019/10/27 20:23
 */
public class BuilderTest {
    
    public static void main(String[] args) {
        Director director = new Director();
        
        // 具体产品
        ToyBuilder toyBuilder = new ToyBuilder();
        director.construct(toyBuilder);
        Product yellowDuck = toyBuilder.createProduct();
        yellowDuck.show();
        
    
        ToyGunBuilder toyGunBuilder = new ToyGunBuilder();
        director.construct(toyGunBuilder);
        Product gun = toyGunBuilder.createProduct();
        gun.show();
    }
}
