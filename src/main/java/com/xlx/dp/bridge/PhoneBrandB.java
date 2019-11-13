package com.xlx.dp.bridge;

/**
 * 手机品牌B
 *
 * @author xielx at 2019/11/8 15:13
 */
public class PhoneBrandB extends CellPhoneBrand {
    
    
    public PhoneBrandB(String name){
        super(name);
    }
    
    @Override
    protected void run() {
        super.softPhone.run();
    }
}
