package com.xlx.dp.factorymethodpattern;

import com.xlx.dp.factorymethodpattern.entity.LeiFen;

/**
 * 工厂方法测试
 *
 * @author xielx at 2019/10/25 20:00
 */
public class FactoryMethodTest {
    
    public static void main(String[] args) {
        // 大学生群体
        UnderGraduateFactory underGraduateFactory = new UnderGraduateFactory();
        LeiFen student = underGraduateFactory.createLeiFen();
        student.bySomeRice();
        
        // 志愿者群体
        VolunteerFactory volunteerFactory = new VolunteerFactory();
        LeiFen volunteer = volunteerFactory.createLeiFen();
        volunteer.doCleaning();
        
        // 其他爱心人士
        // 1.创建爱心人士类(继承雷锋)
        // 2.创建对应具体爱心人士工厂方法
        // 3.工厂方法实例化爱心人士对象
        // 4.调用方法
    }
}
