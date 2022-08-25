package com.st;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: zhangtian1
 * Date: 2022/8/25
 */
public class BeanFactory {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
