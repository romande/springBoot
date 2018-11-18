package com.example.demo.util.spring;

import org.springframework.context.ApplicationContext;

/**
 * context设置工具
 */
public class ContextUtil {

    private static ApplicationContext applicationContext;

    /**
     * 获取上下文
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 设置上下文
     * @param applicationContext
     */
    public static void setApplicationContext(ApplicationContext applicationContext) {
        ContextUtil.applicationContext = applicationContext;
    }

    /**
     * 通过名字获取上下文中的bean
     * @param name
     * @return
     */
    public static Object getBean(String name){
        return applicationContext.getBean(name);
    }

    /**
     * 通过类型获取上下文中的bean
     * @param requiredType
     * @return
     */
    public static Object getBean(Class<?> requiredType){
        return applicationContext.getBean(requiredType);
    }
}
