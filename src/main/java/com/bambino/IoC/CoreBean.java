package com.bambino.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CoreBean {

    private Impl impl;

    public CoreBean() {

    }

    public void print(){
        impl.println();
    }
}
