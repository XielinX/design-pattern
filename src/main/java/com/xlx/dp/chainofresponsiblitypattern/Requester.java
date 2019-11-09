package com.xlx.dp.chainofresponsiblitypattern;

/**
 * 请求者
 *
 * @author xielx at 2019/11/9 16:28
 */
public class Requester {
    
    /**
     * 请求人
     */
    private String requestName;
    /**
     * 请求类型: 离职,升职,加薪,请假
     */
    private String requestType;
    /**
     * 请求数量
     */
    private Integer requestNum;
    
    /**
     * 请求内容
     */
    private String requestContent;
    
    public Requester(String requestName) {
        this.requestName = requestName;
    }
    
    public String getRequestName() {
        return requestName;
    }
    
    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }
    
    public String getRequestType() {
        return requestType;
    }
    
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    
    public Integer getRequestNum() {
        return requestNum;
    }
    
    public void setRequestNum(Integer requestNum) {
        this.requestNum = requestNum;
    }
    
    public String getRequestContent() {
        return requestContent;
    }
    
    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }
}
