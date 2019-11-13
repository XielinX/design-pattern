package com.xlx.dp.chainofresponsiblity;

/**
 * 责任链模式测试
 *
 * @author xielx at 2019/11/9 17:03
 */
public class ChainOfResponsibilityTest {
    
    public static void main(String[] args) {
        
        // 主管
        CommonManager jinli = new CommonManager("张三经理");
        Majordomo zongjian = new Majordomo("里斯总监");
        GeneralManager zongjinli = new GeneralManager("王五总经理");
        // 上司
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zongjinli);
        
        // 员工
        Requester r1 = new Requester("小萝莉");
        r1.setRequestType("加薪");
        r1.setRequestContent("我小萝莉要加薪");
        r1.setRequestNum(400);
        
        jinli.dealWithRequest(r1);
    
        Requester r2 = new Requester("自治州");
        r2.setRequestType("加薪");
        r2.setRequestContent("我自治州要加薪");
        r2.setRequestNum(700);
    
        jinli.dealWithRequest(r2);
        
    }
}
