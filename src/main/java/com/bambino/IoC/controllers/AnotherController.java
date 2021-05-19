package com.bambino.IoC.controllers;

import org.springframework.stereotype.Component;

@Component
public class AnotherController {

    public void inject(){
        System.out.println(AnotherController.class.getSimpleName());
    }
}
