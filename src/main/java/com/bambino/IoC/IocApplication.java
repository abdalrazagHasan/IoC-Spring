package com.bambino.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootApplication
public class IocApplication {

    @Autowired
    private Map<String,Impl> map;

    public IocApplication(Map<String,Impl> map){
        this.map = map;
    }

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(IocApplication.class,args);

        Map<String,Impl> map = context.getBean(IocApplication.class).map;

        map.get("implClass2").println();

    }
}
