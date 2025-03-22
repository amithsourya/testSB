package com.amith.Test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void show(){
        System.out.println("Desktop is shining");
    }
}
