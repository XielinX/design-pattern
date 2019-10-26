package com.xlx.dp.templatemethodpattern;

/**
 * 考生B作答的试卷
 *
 * @author xielx at 2019/10/26 16:56
 */
public class TestPaperB extends MathTestPaper {
    
    @Override
    protected String answer1() {
        return "1";
    }
    
    @Override
    protected String answer2() {
        return "21";
    }
    
    @Override
    protected String answer3() {
        return "32";
    }
}
