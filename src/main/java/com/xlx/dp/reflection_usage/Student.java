package com.xlx.dp.reflection_usage;

/**
 * 人物类,用于反射测试
 *
 * @author xielx at 2019/11/2 15:57
 */
public class Student {
    
    /**
     * 私有属性(字段):姓名
     */
    private String stuName;
    /**
     * 公共属性(字段):年龄
     */
    public Integer age;
    
    /**
     * 公共的无参构造
     */
    public Student(){}
    
    /**
     * 私有带参构造
     * @param stuName 姓名
     */
    private Student(String stuName){
        this.stuName = stuName;
    }
    
    /**
     * 公共的年龄赋值方法
     * @param age 年龄
     */
    public void setAge(Integer age){
        this.age = age;
    }
    
    /**
     * 私有打印方法
     * @param msg 消息
     * @return show
     */
    private String show(String msg){
        System.out.println("show:" + stuName + "," + age + "," + msg);
        return "show-method";
    }
    
    
}
