package com.xlx.dp.chainofresponsiblitypattern;

import java.util.Objects;

/**
 * 总经理
 *
 * @author xielx at 2019/11/9 16:32
 */
public class GeneralManager extends Manager{
    
    public GeneralManager(String name){
        super(name);
    }
    
    
    
    @Override
    public void dealWithRequest(Requester requester) {
        
        if (Objects.equals("请假",requester.getRequestType()) && requester.getRequestNum() < 2){
            System.out.println(name + ":" + requester.getRequestContent() + ",数量: " + requester.getRequestNum() + ",批准");
        }else if (Objects.equals("加薪",requester.getRequestType()) && requester.getRequestNum() <500){
            System.out.println(name + ":" + requester.getRequestContent() + ",提薪: " + requester.getRequestNum() + ",批准");
        }else{
            System.out.println(name + ":" + requester.getRequestContent() + ",提薪: " + requester.getRequestNum() + "下,次在说吧");
            
        }
        
    }
}
