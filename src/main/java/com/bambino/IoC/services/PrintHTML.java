package com.bambino.IoC.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service(value = "printerHTML")
@Primary
public class PrintHTML implements Printer{

    @Override
    public void printAsIs() {
        System.out.println("print html");
    }
}
