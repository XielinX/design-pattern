package com.xlx.dp.state;

/**
 * 状态模式测试
 *
 * @author xielx at 2019/11/4 17:55
 */
public class StatePatternTest {
    
    public static void main(String[] args) {
        Work project = new Work();
        project.setHour(9);
        project.writeProgram();
    
    
        project.setHour(10);
        project.writeProgram();
    
        project.setHour(13);
        project.writeProgram();
    
        
        project.setHour(17);
        project.setFinished(false);
        project.writeProgram();
    
        project.setHour(22);
        project.writeProgram();
    }
}
