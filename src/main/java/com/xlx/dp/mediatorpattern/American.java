package com.xlx.dp.mediatorpattern;

/**
 * 美国
 *
 * @author xielx at 2019/11/10 19:38
 */
public class American extends Country {
    
    
    public American(UnionNation unionNation){
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
        System.out.println("美国获得对方的回复:" + msg);
    }
}
