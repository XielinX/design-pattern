package com.xlx.dp.factorymethodpattern;

import com.xlx.dp.factorymethodpattern.entity.LeiFen;

/**
 * 抽象工厂,最后由实际的工厂实现
 *
 * @author xielx at 2019/10/25 19:53
 */
public interface IFactory {
    
    /**
     * 实例化方法
     * @return 雷锋
     */
    LeiFen createLeiFen();
}
