package com.bambino.IoC.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Service
@Scope(value = SCOPE_SINGLETON)
public class Second {

    private final Proxy proxy;

    public Second(Proxy proxy){
        this.proxy = proxy;
    }

    public First getFirst() {
        return proxy.getFirst();
    }

    public void setFirst(First first) {
        this.proxy.setFirst(first);
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Second{" +
                "first=" + proxy.getFirst() +
                '}';
    }
}
