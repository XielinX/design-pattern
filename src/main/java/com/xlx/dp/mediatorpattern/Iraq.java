package com.xlx.dp.mediatorpattern;

/**
 * 伊拉克
 *
 * @author xielx at 2019/11/10 19:38
 */
public class Iraq extends Country {
    
    
    public Iraq(UnionNation unionNation){
        super(unionNation);
    }
    
    
    /**
     * 发送消息
     * @param msg 消息
     */
    public void sendMessage(String msg){
        super.un.declare(msg,this);
    }
    
    /**
     * 获取恢复
     * @param msg 消息
     */
    public void getMessage(String msg){
        System.out.println("伊拉克获得对方回复:" + msg);
    }
}
