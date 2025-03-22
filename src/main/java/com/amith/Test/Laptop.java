package com.amith.Test;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void show(){
        System.out.println("Laptop is shining");
    }
}
