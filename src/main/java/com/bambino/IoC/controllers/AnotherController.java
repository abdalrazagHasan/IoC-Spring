package com.bambino.IoC.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class AnotherController implements ControllerOperations {

    public void greeting(){
        System.out.println(AnotherController.class.getSimpleName());
    }

    @Override
    public String toString() {
        return AnotherController.class.getSimpleName();
    }
}
