package com.bambino.IoC;

import com.bambino.IoC.services.FakeDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:datasource.properties")
public class IocApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(IocApplication.class,args);

        FakeDatasource fakeDatasource
                = context.getBean(FakeDatasource.class);

        System.out.println(fakeDatasource.getUsername());
        System.out.println(fakeDatasource.getPassword());
        System.out.println(fakeDatasource.getUrl());

    }
}
