package com.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbAutowiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SbAutowiringApplication.class, args);
		Laptop laptop=context.getBean(Laptop.class);
		laptop.display();
	}

}
