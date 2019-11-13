package com.xlx.dp.proxy;

import com.xlx.dp.proxy.entity.Proxyer;
import com.xlx.dp.proxy.entity.Pursuiter;
import com.xlx.dp.proxy.entity.SchoolGirl;

/**
 * 代理测试
 *
 * @author xielx at 2019/10/25 16:02
 */
public class ProxyTest {
    
    
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl("小翠");
        Pursuiter boy = new Pursuiter("小白",girl);
        Proxyer proxyer = new Proxyer("隔壁小王",boy);
        
        proxyer.giveChocolate();
        proxyer.giveMoiveTickets();
        proxyer.sendFlowers();
    }
}
