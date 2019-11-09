package com.xlx.dp.chainofresponsiblitypattern;

import java.util.Objects;

/**
 * 总监
 *
 * @author xielx at 2019/11/9 16:32
 */
public class Majordomo extends Manager{
    
    public Majordomo(String name){
        super(name);
    }
    
    
    
    @Override
    public void dealWithRequest(Requester requester) {
        
        if (Objects.equals("请假",requester.getRequestType()) && requester.getRequestNum() < 5){
            System.out.println(name + ":" + requester.getRequestContent() + ",数量" + requester.getRequestNum() + "批准");
        }else{
            super.superior.dealWithRequest(requester);
        }
        
    }
}
