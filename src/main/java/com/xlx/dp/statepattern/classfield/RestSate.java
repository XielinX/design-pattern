package com.xlx.dp.statepattern.classfield;

import com.xlx.dp.statepattern.State;
import com.xlx.dp.statepattern.Work;

/**
 * 休息/下班状态
 *
 * @author xielx at 2019/11/4 17:51
 */
public class RestSate extends State {
    
    
    @Override
    public void doWorkOfProgram(Work work) {
        System.out.println("当前时间:" + work.getHour() + "点,下班了");
    }
}
