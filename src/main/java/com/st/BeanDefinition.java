package com.st;

/**
 * Author: zhangtian1
 * Date: 2022/8/25
 * 封装 Bean 对象
 */
public class BeanDefinition {

    private final Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
