package com.xlx.dp.observer;

/**
 * 观察者模式测试
 *
 * @author xielx at 2019/10/28 16:20
 */
public class ObserverTest {
    
    public static void main(String[] args) {
        
        FrontMM mm = new FrontMM("蔡小姐");
        
        EmployeeA a = new EmployeeA("员工A",mm);
        EmployeeB b = new EmployeeB("员工B",mm);
        EmployeeC c = new EmployeeC("员工C",mm);
        
        // 老板来了记得通知下啊,a,b
        mm.attach(c);
        mm.attach(a);
        mm.attach(b);
        
        // 忘记通知c
        mm.unattach(c);
        
        mm.setAction("WX告知:老板来查岗了");
        mm.notice();
        
        
        
    }
    
}
