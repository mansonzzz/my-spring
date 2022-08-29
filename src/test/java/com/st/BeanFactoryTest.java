package com.st;

import com.st.factory.AutowireCapableBeanFactory;
import com.st.factory.BeanFactory;
import org.junit.jupiter.api.Test;

/**
 * Author: zhangtian1
 * Date: 2022/8/25
 */
public class BeanFactoryTest {

    private static final String BEAN_NAME = "helloWorldBean";

    private static final String BEAN_CLASS_NAME = "com.st.HelloWorldBean";

    @Test
    public void test001BeanFactory() {

        // 初始化 BeanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 注入 Bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName(BEAN_CLASS_NAME);
        beanFactory.registerBeanDefinition(BEAN_NAME, beanDefinition);

        // 获取 Bean
        HelloWorldBean bean = (HelloWorldBean) beanFactory.getBean(BEAN_NAME);
        bean.hello();

    }

}
