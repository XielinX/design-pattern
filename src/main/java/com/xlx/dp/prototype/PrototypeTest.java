package com.xlx.dp.prototype;

/**
 * 模型测试
 *
 * @author xielx at 2019/10/26 12:02
 */
public class PrototypeTest {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("小巴");
        a.setPersonInfo("男",23);
        a.setExperience("2012-12-01","XXXX");
        a.display();
    
        // 克隆
        Resume b = (Resume) a.clone();
        System.out.println(a == b); // 深克隆
        b.setExperience("2013-01-01","YYYYY");
        b.display();
        
        Resume c = (Resume) b.clone();
        System.out.println(b == c);
        b.setExperience("2015-11-11","ZZZZZZ");
        b.display();
        
        
    }
}
