package com.xlx.dp.state.classfield;

import com.xlx.dp.state.State;
import com.xlx.dp.state.Work;

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
