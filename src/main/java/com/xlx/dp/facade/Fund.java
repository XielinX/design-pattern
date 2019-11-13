package com.xlx.dp.facade;

import com.xlx.dp.facade.stock.NationalDebet;
import com.xlx.dp.facade.stock.Realty;
import com.xlx.dp.facade.stock.Stock1;
import com.xlx.dp.facade.stock.Stock2;

/**
 * 基金
 *
 * @author xielx at 2019/10/27 15:28
 */
public class Fund {
    
    private Stock1 stock1;
    private Stock2 stock2;
    private NationalDebet nationalDebet;
    private Realty realty;
    
    public Fund(){
        stock1 = new Stock1();
        stock2 = new Stock2();
        nationalDebet = new NationalDebet();
        realty = new Realty();
    }
    
    /**
     * 购买基金
     */
    public void buyFund(){
        stock1.buy();
        stock2.buy();
        nationalDebet.buy();
        realty.buy();
    }
    
    /**
     * 抛售基金
     */
    public void sellFund(){
        stock1.sell();
        stock2.sell();
        nationalDebet.sell();
        realty.sell();
    }
}
