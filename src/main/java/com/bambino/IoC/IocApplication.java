package com.bambino.IoC;

import com.bambino.IoC.beans.First;
import com.bambino.IoC.beans.Second;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(IocApplication.class,args);

        First first = context.getBean(First.class);
        Second second = context.getBean(Second.class);
        first.setName("hello");
        second.setFirst(first);
        second.getFirst().print();
        Second bean = context.getBean(Second.class);
        bean.getFirst().print();
    }
}
