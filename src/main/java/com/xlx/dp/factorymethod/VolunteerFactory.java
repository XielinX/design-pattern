package com.xlx.dp.factorymethod;

import com.xlx.dp.factorymethod.entity.LeiFen;
import com.xlx.dp.factorymethod.entity.Volunteer;

/**
 * 志愿者工厂
 *
 * @author xielx at 2019/10/25 19:59
 */
public class VolunteerFactory implements IFactory {
    
    
    @Override
    public LeiFen createLeiFen() {
        return new Volunteer();
    }
}
