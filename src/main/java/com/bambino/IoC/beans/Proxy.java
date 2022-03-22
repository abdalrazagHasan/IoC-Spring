package com.bambino.IoC.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class Proxy implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    private First first;

    public Proxy(){

    }

    public First getFirst() {
        this.first = applicationContext.getBean(First.class);
        return first;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
