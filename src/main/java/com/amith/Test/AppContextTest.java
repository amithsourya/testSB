package com.amith.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AppContextTest {

    @Autowired
    @Qualifier("laptop")
    Computer lap;

    public void someMethodToPrint(){
        System.out.println("This is a test method");
        lap.show();
    }
}
