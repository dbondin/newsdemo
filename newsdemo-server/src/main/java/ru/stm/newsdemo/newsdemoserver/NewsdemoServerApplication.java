package ru.stm.newsdemo.newsdemoserver;


import java.math.BigInteger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ru.stm.newsdemo.newsdemoserver.domain.User;
import ru.stm.newsdemo.newsdemoserver.repositories.UserRepository;

@SpringBootApplication
public class NewsdemoServerApplication {
	
	  @Autowired
	    DataSource dataSource;

	    @Autowired
	    UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(NewsdemoServerApplication.class, args);
		
	       }
	
	    public void run(String... args) throws Exception {
	    	userRepository.save(new User(new BigInteger("1"),"newsdemo1","newsdemo1"));
	    	userRepository.save(new User(new BigInteger("2"),"newsdemo2","newsdemo2"));
	    	userRepository.save(new User(new BigInteger("3"),"newsdemo3","newsdemo3"));

	        System.out.println("DATASOURCE = " + dataSource);

	        System.out.println("\n1.findAll()...");
	        for (User u : userRepository.findAll()) {
	           u.toString();
	        }

	        System.out.println("\n2.findByUSERNAME(String USERNAME)...");
	        for (User u : userRepository.findByUSERNAME("newsdemo1")) {
	          u.toString();
	        }

	        System.out.println("\n3.findByID(ID)...");
	        this.userRepository.findById(new BigInteger("2")).toString();

	        System.out.println("Done!");

	        wait(0);
	    }

	
}
