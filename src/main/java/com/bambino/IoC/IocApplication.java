package com.bambino.IoC;

import com.bambino.IoC.controllers.MoreController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(IocApplication.class, args);

        ManagerControllerOperations manager = context.getBean(ManagerControllerOperations.class);
        manager.greeting(MoreController.class);
    }

}
