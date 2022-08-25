package com.st;

import org.junit.jupiter.api.Test;

/**
 * Author: zhangtian1
 * Date: 2022/8/25
 */
public class BeanFactoryTest {

    private static final String BEAN_NAME = "helloWorldBean";

    @Test
    public void test001BeanFactory() {

        // 初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 注入 Bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldBean());
        beanFactory.registerBeanDefinition(BEAN_NAME, beanDefinition);

        // 获取 Bean
        HelloWorldBean bean = (HelloWorldBean) beanFactory.getBean(BEAN_NAME);
        bean.hello();

    }

}
