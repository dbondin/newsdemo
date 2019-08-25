package ru.stm.newsdemo.newsdemoserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ru.stm.newsdemo.newsdemoserver.domain.User;
import ru.stm.newsdemo.newsdemoserver.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsdemoServerApplicationTests {
	
	private final Logger logger = LoggerFactory.getLogger(NewsdemoServerApplicationTests.class);
	
	@Autowired
	private UserService userService;

	@Test
	public void firstTest() {

		logger.info("Creating testing entities");
		for (int i = 1; i <= 3; ++i) {
			final User u = new User();
			u.setUsername("newsdemo" + i);
			u.setPassword("newsdemo" + i);
			logger.info("saving {}", u);
			userService.save(u);
		}
		logger.info("Testing findAll()");
		for (User u : userService.findAll()) {
			logger.info("{}", u);
		}

		logger.info("Testing findByUsername()");
		logger.info("{}", userService.findByUsername("newsdemo1").get());

		logger.info("Tesfing findById()");
		logger.info("{}", this.userService.findById(1L).get());
	}
}
