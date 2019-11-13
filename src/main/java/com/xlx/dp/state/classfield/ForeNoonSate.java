package com.xlx.dp.state.classfield;

import com.xlx.dp.state.State;
import com.xlx.dp.state.Work;

/**
 * 上午
 *
 * @author xielx at 2019/11/4 16:24
 */
public class ForeNoonSate extends State {
    
    @Override
    public void doWorkOfProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间:" + work.getHour() + "点,上午工作,精神百倍");
            return;
        }
    
        // 超过12点,转换状态
        work.setState(new NoonState());
        work.writeProgram();
    }
}
