package com.bambino.IoC.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Service
@Scope(value = SCOPE_PROTOTYPE)
public class First {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "First{" +
                "name='" + name + '\'' +
                '}';
    }
}

