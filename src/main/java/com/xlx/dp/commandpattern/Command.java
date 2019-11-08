package com.xlx.dp.commandpattern;

/**
 * 命令-客户订单
 *
 * @author xielx at 2019/11/8 17:38
 */
public abstract class Command {
    
    
    protected Chief chushi;
    
    public Command(Chief chief){
        this.chushi = chief;
    }
    
    /**
     * 工作
     */
    protected abstract void work();
}
