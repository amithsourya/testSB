package com.amith.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ApplicationContext cont = SpringApplication.run(TestApplication.class, args);
		AppContextTest app = cont.getBean(AppContextTest.class);
		;
		app.someMethodToPrint();
	}

}
