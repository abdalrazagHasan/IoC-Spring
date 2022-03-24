package com.bambino.IoC;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

public class ImplClass2 implements Impl{
    @Override
    public void println() {
        System.out.println("set is called");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
