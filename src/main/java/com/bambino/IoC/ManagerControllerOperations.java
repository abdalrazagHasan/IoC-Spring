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

    @Autowired
    public ManagerControllerOperations(List<ControllerOperations> controllersOperations){
        this.controllersOperations = controllersOperations;
    }

    public void greeting(){
        controllersOperations.forEach(System.out::println);
    }

    public void greeting(String type){
        for (ControllerOperations instance : controllersOperations){
            if (instance.toString().equals(type)){
                instance.greeting();
                return;
            }
        }
        System.out.println("there is no such this type");
    }


}
