package com.xlx.dp.adapter;

/**
 * 适配器模式测试
 *
 * @author xielx at 2019/11/5 14:20
 */
public class AdapterTest {
    
    public static void main(String[] args) {
        
        // 本土成员
        Player forward = new ForwordPlayer("Alpha");
        Player center = new CenterPlayer("BoBo");
        Player back = new BackPlayer("Candy");
        
        // 新加入的外籍成员
        ForeignPlay foreign = new ForeignPlay("姚明");
    
        Translator translator = new Translator("翻译官");
        translator.setForigenPlay(foreign);
    
    
        forward.attack();
        center.defense();
        back.attack();
        translator.attack();
    }
    
}
