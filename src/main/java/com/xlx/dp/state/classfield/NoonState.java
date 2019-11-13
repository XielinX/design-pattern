package com.xlx.dp.state.classfield;

import com.xlx.dp.state.State;
import com.xlx.dp.state.Work;

/**
 * 中午状态
 *
 * @author xielx at 2019/11/4 16:34
 */
public class NoonState extends State {
    
    
    @Override
    public void doWorkOfProgram(Work work) {
        if (work.getHour() < 13){
            System.out.println("当前时间:" + work.getHour() + "点,中午工作,精神百倍");
            return;
        }
    
        // 超过13点,转人下午
        work.setState(new AfterNoonState());
        work.writeProgram();
    }
}
