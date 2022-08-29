package com.st.factory;

import com.st.BeanDefinition;

/**
 * @author zhangtian1
 * 抽象接口
 */
public interface BeanFactory {

    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);

}
