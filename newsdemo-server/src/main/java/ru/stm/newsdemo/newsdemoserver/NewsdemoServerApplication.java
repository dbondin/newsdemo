package ru.stm.newsdemo.newsdemoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
@SpringBootApplication
public class NewsdemoServerApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(NewsdemoServerApplication.class, args);

	}

}
