package com.bambino.IoC;

import com.bambino.IoC.controllers.ControllerOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ManagerControllerOperations  {


    private final ControllerOperations moreController;

    @Autowired
    public ManagerControllerOperations(@Qualifier("moreController") ControllerOperations moreController){
        this.moreController = moreController;
    }

    public void greeting(){
        moreController.greeting();
    }


}
