package com.xlx.dp.bridgepattern;

/**
 * 桥接模式
 *
 * @author xielx at 2019/11/8 15:17
 */
public class BridgeTest {
    
    public static void main(String[] args) {
        // 手机类型A
        CellPhoneBrand brandA = new PhoneBrandA("AAAA");
        // 软件
        SoftPhone game = new Game("魂斗罗");
        brandA.setSoftPhone(game);
        brandA.run();
        
        // 手机B
        CellPhoneBrand brandB = new PhoneBrandB("BBBB");
        // 安装软件
        SoftPhone addressList = new AddressList("通讯录");
        brandB.setSoftPhone(addressList);
        brandB.run();
    }
    
}
