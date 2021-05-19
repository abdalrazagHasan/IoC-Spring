package com.bambino.IoC.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    private final AnotherController anotherController;

    public HomeController(AnotherController anotherController){
        this.anotherController = anotherController;
    }


    public void greeting(){
        anotherController.inject();
    }

}
