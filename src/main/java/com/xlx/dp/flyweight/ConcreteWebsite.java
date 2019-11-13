package com.xlx.dp.flyweight;

/**
 * 网站具体类
 *
 * @author xielx at 2019/11/12 15:24
 */
public class ConcreteWebsite extends WebSite{
    
    /**
     * 网站分类
     */
    private String classfild;
    
    
    public ConcreteWebsite(String classfild){
        this.classfild = classfild;
    }
    
    @Override
    protected void use(User user) {
        System.out.println("网站分类:" + classfild + ",用户:" + user.getName() );
    }
}
