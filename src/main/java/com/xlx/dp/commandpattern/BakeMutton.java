package com.xlx.dp.commandpattern;

/**
 * 烤羊肉
 *
 * @author xielx at 2019/11/8 21:12
 */
public class BakeMutton extends Command{
    
    
    public BakeMutton(Chief chief){
        super(chief);
    }
    
    @Override
    protected void work() {
        chushi.bakeMutton();
    }
}
