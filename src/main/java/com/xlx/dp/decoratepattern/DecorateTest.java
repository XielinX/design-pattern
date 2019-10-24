package com.xlx.dp.decoratepattern;

import com.xlx.dp.decoratepattern.dressup.BigTrouser;
import com.xlx.dp.decoratepattern.dressup.Sneakers;
import com.xlx.dp.decoratepattern.dressup.Tshirts;

/**
 * 装饰模式测试
 *
 * @author xielx at 2019/10/24 19:30
 */
public class DecorateTest {
    
    public static void main(String[] args) {
        Person p = new Person("小明");
        
        Sneakers qiuxie = new Sneakers();
        BigTrouser kuzi = new BigTrouser();
        Tshirts txu = new Tshirts();
        
        // 装饰
        qiuxie.decoratePerson(p);
        kuzi.decoratePerson(qiuxie);// 多态
        txu.decoratePerson(kuzi);
        
        txu.show();
        
    }
}
