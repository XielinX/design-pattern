package com.xlx.dp.commandpattern;

/**
 * 命令模式测试
 *
 * @author xielx at 2019/11/8 20:53
 */
public class CommandTest {
    
    public static void main(String[] args) {
        Chief chushi = new Chief();
        Watier watier = new Watier();
        
        Bakechilken chicken1 = new Bakechilken(chushi);
        BakeMutton mutton = new BakeMutton(chushi);
        
        watier.setOrders(chicken1);
        watier.setOrders(mutton);
        watier.notice();
        
    }
}
