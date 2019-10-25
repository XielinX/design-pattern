package com.xlx.dp.proxypattern;

/**
 * 追求者 , 小白
 *   小白想追求小红,但是害羞,想委托给好友小王表达
 * @author xielx at 2019/10/25 15,20
 */
public class Pursuiter implements IGiveGift{
    
    /**
     * 姓名
     */
    private String name;
    /**
     * 心意对象
     */
    private SchoolGirl girl;
    
    
    public Pursuiter(String name,SchoolGirl girl){
        this.name = name;
        this.girl = girl;
    }
    
    @Override
    public void sendFlowers() {
        System.out.println(girl.getName() +",送你一朵玫瑰花");
    }
    
    @Override
    public void giveMoiveTickets() {
        System.out.println(girl.getName() + ",送你一张电影票");
    }
    
    @Override
    public void giveChocolate() {
        System.out.println(girl.getName()+ ",送你一个巧克力");
    }
    
}
