package ru.stm.newsdemo.newsdemoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
@SpringBootApplication
public class NewsdemoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsdemoServerApplication.class, args);

	}

}
