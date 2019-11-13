package com.xlx.dp.adapter;

/**
 * 翻译适配器
 *
 * @author xielx at 2019/11/5 14:24
 */
public class Translator extends Player {
    
    private ForeignPlay forigenPlay;
    
    
    
    public Translator(String name){
        super(name);
    }
    
    
    @Override
    protected void attack() {
        forigenPlay.attack();
    }
    
    @Override
    protected void defense() {
        forigenPlay.defense();
    }
    
    public ForeignPlay getForigenPlay() {
        return forigenPlay;
    }
    
    public void setForigenPlay(ForeignPlay forigenPlay) {
        this.forigenPlay = forigenPlay;
    }
}
