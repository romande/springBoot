package com.example.demo.basic;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class IndexController extends WebMvcConfigurationSupport {

    public void addViewController(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("forward:index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
}
