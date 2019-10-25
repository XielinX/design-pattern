package com.xlx.dp.proxypattern.entity;

import com.xlx.dp.proxypattern.IGiveGift;

/**
 * 代理者 :中介
 *
 * @author xielx at 2019/10/25 15:37
 */
public class Proxyer implements IGiveGift {
    
    /**
     * 代理者名称
     */
    private String proxyerName;
    
    
    /**
     * 追求者,必须
     */
    private Pursuiter pursuiter;
    
    public Proxyer(String proxyerName,Pursuiter pursuiter){
        this.proxyerName = proxyerName;
        this.pursuiter = pursuiter;
    }
    
    
    @Override
    public void sendFlowers() {
        System.out.print(proxyerName + ": ");
        pursuiter.sendFlowers();
    }
    
    @Override
    public void giveMoiveTickets() {
        System.out.print(proxyerName + ": ");
        pursuiter.giveMoiveTickets();
    }
    
    @Override
    public void giveChocolate() {
        System.out.print(proxyerName + ": ");
        pursuiter.giveChocolate();
    }
}
