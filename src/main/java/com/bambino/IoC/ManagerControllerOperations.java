package com.bambino.IoC;

import com.bambino.IoC.controllers.ControllerOperations;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ManagerControllerOperations  implements InitializingBean,
        DisposableBean , BeanPostProcessor , BeanNameAware {

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


    @Override
    public void setBeanName(String s) {
        controllerOperations.greeting();
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init()");
    }
}
