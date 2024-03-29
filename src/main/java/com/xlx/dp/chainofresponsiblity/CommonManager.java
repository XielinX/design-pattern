package com.xlx.dp.chainofresponsiblity;

import java.util.Objects;

/**
 * 经理
 *
 * @author xielx at 2019/11/9 16:32
 */
public class CommonManager extends Manager{
    
    public CommonManager(String name){
        super(name);
    }
    
    
    
    @Override
    public void dealWithRequest(Requester requester) {
        
        if (Objects.equals("请假",requester.getRequestType()) && requester.getRequestNum() < 2){
            System.out.println(name + ":" + requester.getRequestContent() + ",数量" + requester.getRequestNum() + "批准");
        }else{
            super.superior.dealWithRequest(requester);
        }
        
    }
}
