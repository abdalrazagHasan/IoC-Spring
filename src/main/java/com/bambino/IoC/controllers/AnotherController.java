package com.bambino.IoC.controllers;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Profile("An")
@Component
public class AnotherController implements ControllerOperations , InitializingBean, DisposableBean {

    public void greeting(){
        System.out.println(AnotherController.class.getSimpleName());
    }

    @Override
    public String toString() {
        return AnotherController.class.getSimpleName();
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
