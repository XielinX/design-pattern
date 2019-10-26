package com.xlx.dp.templatemethodpattern;

/**
 * 数学测试卷
 *   问题:老师在黑板布置了几道题,同学们抄在作业本上做题
 *   题目都是一样的(学生也可能会抄错),只是答案不一样而已
 *   所以会把题目和回答问题的方式抽象化,学生只需要提交答案就行了
 *
 * @author xielx at 2019/10/26 15:06
 */
public abstract class MathTestPaper {
    
    /**
     * 问题1
     */
    public void question1(){
        System.out.println("运算题1: 1 + 1 =");
        System.out.println("运算题1答案:" + answer1());
    }
    
    protected abstract String answer1();
    
    /**
     * 问题2
     */
    public void question2(){
        System.out.println("运算题2: 11 + 12 =");
        System.out.println("运算题2答案:" + answer2());
    }
    
    protected abstract String answer2();
    
    /**
     * 问题3
     */
    public void question3(){
        System.out.println("运算题3: 13 + 11 =");
        System.out.println("运算题3答案:" + answer3());
    }
    
    protected abstract String answer3();
}
