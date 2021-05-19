package com.bambino.IoC.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("moreController")
public class MoreController implements ControllerOperations {

    public void greeting(){
        System.out.println(MoreController.class.getSimpleName());
    }

    @Override
    public String toString() {
        return MoreController.class.getSimpleName();
    }
}
