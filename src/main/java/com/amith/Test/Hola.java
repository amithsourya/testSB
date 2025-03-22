package com.amith.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hola {

    @RequestMapping("/")
    public String hhh(String[] args) {
        return ("Hola World");
    }
}
