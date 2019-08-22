package ru.stm.newsdemo.newsdemoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan
public class NewsdemoServerApplication {//new commit

	public static void main(String[] args) {
		SpringApplication.run(NewsdemoServerApplication.class, args);
	}

}
