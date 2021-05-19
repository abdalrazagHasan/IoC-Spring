package com.bambino.IoC.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("anotherController")
public class AnotherController implements ControllerOperations {

    public void greeting(){
        System.out.println(AnotherController.class.getSimpleName());
    }

    @Override
    public String toString() {
        return AnotherController.class.getSimpleName();
    }
}
