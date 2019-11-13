package com.xlx.dp.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员
 *
 * @author xielx at 2019/11/8 20:50
 */
public class Watier {
    
    private List<Command> commandList = new ArrayList<>(10);
    
    public void setOrders(Command command) {
        commandList.add(command);
    }
    
    /**
     * 通知师傅烤肉
     */
    public void notice(){
        commandList.forEach(command -> command.work());
    }
}
