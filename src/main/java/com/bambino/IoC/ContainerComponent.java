package com.bambino.IoC;

import com.bambino.IoC.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

@Service
public class ContainerComponent {

    @Autowired
    private final Map<String,Printer> printer;

    public ContainerComponent(@Qualifier("printerHTML") Map<String,Printer> printer) {
        this.printer = printer;
    }

    public Collection<? extends String> actualPrinters(){
        return printer.keySet();
    }

    public Collection<Printer> getPrinter() {
        return printer.values();
    }
}
