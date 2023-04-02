package com.springboot2.MyWebApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.ModelMap;

@SpringBootApplication
//@ComponentScan("MyWebApp2")
public class MyWebApp2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(MyWebApp2Application.class, args);
	}

}
