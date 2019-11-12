package com.xlx.dp.flyweightpattern;

/**
 * 享元模式测试
 *
 * @author xielx at 2019/11/12 15:41
 */
public class FlyweightTest {
    
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        
        WebSite webSite1 = factory.getWebSiteFactory("电影");
        webSite1.use(new User("张三"));
    
        WebSite webSite2 = factory.getWebSiteFactory("电影");
        webSite2.use(new User("李四"));
    
    
        WebSite webSite3 = factory.getWebSiteFactory("纪念馆");
        webSite1.use(new User("张s"));
    
        WebSite webSite4= factory.getWebSiteFactory("电影");
        webSite2.use(new User("李w"));
    
        Integer count = factory.count();
        System.out.println("实例个数:" + count);
    
    }
}
