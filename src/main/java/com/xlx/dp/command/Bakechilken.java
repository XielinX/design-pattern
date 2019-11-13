package com.xlx.dp.command;

/**
 * 烤鸡肉
 *
 * @author xielx at 2019/11/8 20:55
 */
public class Bakechilken extends Command {
    
    public Bakechilken(Chief chief){
        super(chief);
    }
    
    @Override
    protected void work() {
        chushi.bakeChilken();
    }
}
