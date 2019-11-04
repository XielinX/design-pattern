package com.xlx.dp.statepattern;

/**
 * 状态抽象类
 *   中午时间
 *   下午时间
 *   休息时间
 *   晚上时间
 *   下班时间
 * @author xielx at 2019/11/4 16:21
 */
public abstract class State {
    
    /**
     * 编码工作
     * @param work 工作类
     */
    public abstract void doWorkOfProgram(Work work);
}
