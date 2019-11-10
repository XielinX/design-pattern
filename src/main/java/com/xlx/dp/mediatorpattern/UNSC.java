package com.xlx.dp.mediatorpattern;

/**
 * 联合国安理会
 *
 * @author xielx at 2019/11/10 19:57
 */
public class UNSC extends UnionNation {
    
    private American american;
    private Iraq iraq;
    
    
    
    @Override
    public void declare(String message, Country country) {
        if (country instanceof American){
            iraq.getMessage(message);
        }else {
            american.getMessage(message);
        }
        
    }
    
    
    public American getAmerican() {
        return american;
    }
    
    public void setAmerican(American american) {
        this.american = american;
    }
    
    public Iraq getIraq() {
        return iraq;
    }
    
    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }
}
