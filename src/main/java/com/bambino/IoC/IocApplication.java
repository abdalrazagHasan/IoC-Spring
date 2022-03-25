package com.bambino.IoC;

import com.bambino.IoC.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//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

@SpringBootApplication
public class IocApplication {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(IocApplication.class,args);

        ContainerComponent printer = context.getBean(ContainerComponent.class);

        printer.actualPrinters().forEach(System.out::println);

    }
}
