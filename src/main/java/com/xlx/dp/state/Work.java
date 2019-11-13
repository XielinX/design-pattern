package com.xlx.dp.state;

import com.xlx.dp.state.classfield.ForeNoonSate;

/**
 * 工作类
 *
 * @author xielx at 2019/11/4 16:21
 */
public class Work {
    
    /**
     * 钟点
     */
    private Integer hour;
    /**
     * 工作完成标志 1:done 2:undo
     */
    private Boolean finished;
    /**
     * 状态类对象
     */
    private  State state;
    
    /**
     * 工作初始化,状态默认为上午
     */
    public Work() {
        this.state = new ForeNoonSate();
    }
    
    /**
     * 工作
     */
    public void writeProgram(){
        state.doWorkOfProgram(this);
    }
    
    
    /** setter and getter*/
    public Integer getHour() {
        return hour;
    }
    
    public void setHour(Integer hour) {
        this.hour = hour;
    }
    
    public Boolean getFinished() {
        return finished;
    }
    
    public void setFinished(Boolean finished) {
        this.finished = finished;
    }
    
    public State getState() {
        return state;
    }
    
    public void setState(State state) {
        this.state = state;
    }
}
