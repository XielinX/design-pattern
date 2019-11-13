package com.xlx.dp.state.classfield;

import com.xlx.dp.state.State;
import com.xlx.dp.state.Work;

/**
 * 晚上状态
 *
 * @author xielx at 2019/11/4 16:34
 */
public class EveningState extends State {
    
    
    @Override
    public void doWorkOfProgram(Work work) {
        // 工作完成
        if (work.getFinished() != null && work.getFinished()){
            work.setState(new RestSate());
            work.writeProgram();
            return;
        }
        
        if (work.getHour() < 21) {
            System.out.println("当前时间:" + work.getHour() + "点,加班哦,有点累了");
            return;
        }
    
        // 超过21点,转换状态下班
        work.setState(new RestSate());
        work.writeProgram();
    }
}
