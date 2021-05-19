package com.bambino.IoC.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Mo")
public class MoreController implements ControllerOperations {

    private int id;

    public void greeting(){
        System.out.println(id+MoreController.class.getSimpleName());
        id+=2;
    }

    @Override
    public String toString() {
        return MoreController.class.getSimpleName();
    }
}
