package com.xlx.dp.proxypattern;

/**
 * 共同行为接口
 *
 * @author xielx at 2019/10/25 15:16
 */
public interface IGiveGift {
    
    /**
     * 送花
     */
    void sendFlowers();
    
    /**
     * 送电影票
     */
    void giveMoiveTickets();
    
    /**
     * 送巧克力
     */
    void giveChocolate();
}
