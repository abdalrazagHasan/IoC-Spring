package com.bambino.IoC;

import com.bambino.IoC.services.FakeDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(IocApplication.class,args);

        FakeDatasource fakeDatasource
                = context.getBean(FakeDatasource.class);

        System.out.println(fakeDatasource);

    }
}
