package com.xlx.dp.factorymethod;

import com.xlx.dp.factorymethod.entity.LeiFen;
import com.xlx.dp.factorymethod.entity.UnderGraduate;

/**
 * 大学生群体工厂方法
 *
 * @author xielx at 2019/10/25 19:55
 */
public class UnderGraduateFactory implements IFactory{
    
    @Override
    public LeiFen createLeiFen() {
        return new UnderGraduate();
    }
}
