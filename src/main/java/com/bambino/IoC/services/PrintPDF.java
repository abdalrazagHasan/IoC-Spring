package com.bambino.IoC.services;

import org.springframework.stereotype.Service;

@Service(value = "printerPDF")
public class PrintPDF implements Printer{

    @Override
    public void printAsIs() {
        System.out.println("pdf print");
    }

}
