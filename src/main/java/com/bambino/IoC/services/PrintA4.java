package com.bambino.IoC.services;


import org.springframework.stereotype.Service;

@Service(value = "printA4")
public class PrintA4 implements Printer{

    @Override
    public void printAsIs() {
        System.out.println("print A4");
    }

}
