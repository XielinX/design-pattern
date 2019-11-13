package com.xlx.dp.templatemethod;

/**
 * 考生A作答的试卷
 *
 * @author xielx at 2019/10/26 16:56
 */
public class TestPaperA extends MathTestPaper {
    
    @Override
    protected String answer1() {
        return "2";
    }
    
    @Override
    protected String answer2() {
        return "21";
    }
    
    @Override
    protected String answer3() {
        return "23";
    }
}
