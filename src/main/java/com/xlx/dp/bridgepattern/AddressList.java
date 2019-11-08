package com.xlx.dp.bridgepattern;

/**
 * 通讯录
 *
 * @author xielx at 2019/11/8 15:07
 */
public class AddressList extends SoftPhone {
    
    public AddressList(String name){
        super(name);
    }
    
    @Override
    protected void run() {
        System.out.println("通信录正在打开~~~~");
    }
}
