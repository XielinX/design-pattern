package com.xlx.dp.mediator;

/**
 * 中介者模式
 *
 * @author xielx at 2019/11/10 19:52
 */
public class MediatorPatternTest {
    
    public static void main(String[] args) {
        // 安理会,美国,伊拉克
        UNSC unsc = new UNSC();
        American usa = new American(unsc);
        Iraq iraq = new Iraq(unsc);
        
        // 安理会介入两国
        unsc.setAmerican(usa);
        unsc.setIraq(iraq);
        
        usa.sendMessage("在不投降,就放炮了");
        iraq.sendMessage("you can you up,no can no bb");
        
    }
}
