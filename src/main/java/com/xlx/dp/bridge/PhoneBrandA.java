package com.xlx.dp.bridge;

/**
 * 手机品牌A
 *
 * @author xielx at 2019/11/8 15:13
 */
public class PhoneBrandA extends CellPhoneBrand {
    
    
    public PhoneBrandA(String name){
        super(name);
    }
    
    @Override
    protected void run() {
        super.softPhone.run();
    }
}
