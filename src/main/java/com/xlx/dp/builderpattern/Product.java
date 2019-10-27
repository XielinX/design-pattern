package com.xlx.dp.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品
 *
 * @author xielx at 2019/10/27 20:06
 */
public class Product {
    
    List<String> partList = new ArrayList<>();
    
    /**
     * 添加零件
     * @param part 产品零件
     */
    public void addPart(String part){
        partList.add(part);
    }
    
    /**
     * 展示
     */
    public void show(){
        System.out.println("###产品零部件###:");
        partList.forEach(System.out::println);
    }
}
