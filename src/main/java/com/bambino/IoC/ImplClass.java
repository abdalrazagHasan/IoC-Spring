package com.bambino.IoC;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;



public class ImplClass implements Impl{

    @Override
    public void println() {
        System.out.println("setted");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
