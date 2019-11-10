package com.xlx.dp.mediatorpattern;

/**
 * 联合国的抽象类
 *
 * @author xielx at 2019/11/10 19:22
 */
public abstract class UnionNation {
    /**
     * 传话
     * @param message 信息
     * @param toCountry 接收信息的国家
     */
    public abstract void declare(String message,Country toCountry);
}
