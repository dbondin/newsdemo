package ru.stm.newsdemo.newsdemoserver;

import java.math.BigInteger;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ru.stm.newsdemo.newsdemoserver.domain.User;
import ru.stm.newsdemo.newsdemoserver.repositories.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsdemoServerApplicationTests {
	  @Autowired
	    DataSource dataSource;

	    @Autowired
	    UserRepository userRepository;
	   

	@Test
	public void contextLoads() {
	
		userRepository.save(new User("newsdemo1","newsdemo1"));
    	userRepository.save(new User("newsdemo2","newsdemo2"));
    	userRepository.save(new User("newsdemo3","newsdemo3"));
    	 System.out.println("\n1.findAll()...");
	        for (User u : userRepository.findAll()) {
	           u.toString();
	        }

	        System.out.println("\n2.findByUSERNAME(String USERNAME)...");
	        for (User u : userRepository.findByUsername("newsdemo1")) {
	          u.toString();
	        }

	        System.out.println("\n3.findById(Id)...");
	        this.userRepository.findById(2L).toString();
	
	}

}
