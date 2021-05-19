package com.bambino.IoC;

import com.bambino.IoC.controllers.ControllerOperations;
import com.bambino.IoC.controllers.MoreController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ManagerControllerOperations {

    private final List<ControllerOperations> controllersOperations;

    private final ControllerOperations controllerOperations;

    @Autowired
    public ManagerControllerOperations(List<ControllerOperations> controllersOperations,ControllerOperations controllerOperations){
        this.controllersOperations = controllersOperations;
        this.controllerOperations = controllerOperations;
    }

    public void greetingUsingPrimary(){
        controllerOperations.greeting();
    }

    public void greeting(Class type){
        for (ControllerOperations instance : controllersOperations){
            if (instance.toString().equals(type.getSimpleName())){
                instance.greeting();
                return;
            }
        }
        System.out.println("there is no such this type");
    }



}
