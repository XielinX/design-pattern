package com.xlx.dp.prototypepattern;

/**
 * 简历类
 *    有姓名,设置年龄,性别,设置工作经历
 *    打印三份不同工作经历的简历
 *
 * @author xielx at 2019/10/26 11:11
 */
public class Resume implements Cloneable {
    
    private String name;
    private String gender;
    private Integer age;
    
    private Experience experience;
    
    /**
     * 设置信息
     * @param gender 性别
     * @param age 年龄
     */
    public void setPersonInfo(String gender,Integer age){
        this.gender = gender;
        this.age = age;
    }
    
    /**
     * 构造
     * @param name 姓名
     *
     */
    public Resume(String name){
        this.name = name;
        experience = new Experience();
    }
    
    /**
     * 设置工作经历
     * @param workTime 工作时间
     * @param company 公司
     */
    public void setExperience(String workTime,String company){
        experience.setWorkTime(workTime);
        experience.setWorkCompany(company);
    }
    
    
    /**
     * 展示
     */
    public void display(){
        System.out.println("姓名:" + name);
        System.out.println("性别:" + this.gender + ",年龄:" + this.age);
        System.out.println("工作时间:" + this.experience.getWorkTime() + ",公司:" + this.experience.getWorkCompany());
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Experience getExperience() {
        return experience;
    }
    
    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
