package com.xlx.dp.factorymethodpattern;

import com.xlx.dp.factorymethodpattern.entity.LeiFen;
import com.xlx.dp.factorymethodpattern.entity.Volunteer;

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
