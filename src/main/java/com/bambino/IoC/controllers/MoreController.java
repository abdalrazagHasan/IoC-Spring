package com.bambino.IoC.controllers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Profile({"Mo","default"})
public class MoreController implements ControllerOperations , InitializingBean,
        DisposableBean , BeanPostProcessor , BeanNameAware , BeanFactoryAware , ApplicationContextAware {

    public void greeting(){
        System.out.println("greeting");
    }


    @Override
    public String toString() {
        return MoreController.class.getSimpleName();
    }


    // 7
    @Override
    public void destroy() throws Exception {
        System.out.println("destroyed");
    }

    // 5
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }

    // 6
    @PreDestroy
    public void preDestroyed(){
        System.out.println("preDestroyed");
    }

    // 3
    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct");
    }

    // 2
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory : "+beanFactory.getClass().getSimpleName());
    }

    // 1
    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName : "+s);
    }

    // 4
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext : " + applicationContext.getClass().getSimpleName());
    }
}
