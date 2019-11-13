package com.xlx.dp.state.classfield;

import com.xlx.dp.state.State;
import com.xlx.dp.state.Work;

/**
 * 下午状态
 *
 * @author xielx at 2019/11/4 16:34
 */
public class AfterNoonState extends State {
    
    
    @Override
    public void doWorkOfProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间:" + work.getHour() + "点,下午工作,精神百倍");
            return;
        }
    
        // 超过17点,转换状态
        work.setState(new EveningState());
        work.writeProgram();
    }
}
