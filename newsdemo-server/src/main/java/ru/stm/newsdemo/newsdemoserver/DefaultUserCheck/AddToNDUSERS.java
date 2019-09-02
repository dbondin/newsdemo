package ru.stm.newsdemo.newsdemoserver.DefaultUserCheck;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.stm.newsdemo.newsdemoserver.domain.User;
import ru.stm.newsdemo.newsdemoserver.domain.Role;
import ru.stm.newsdemo.newsdemoserver.service.UserService;

@Component
public class AddToNDUSERS {
	@Autowired
	private UserService userService;

	@PostConstruct
	private void postConstruct() {
		Set<Role> adminUser = new HashSet<Role>();
		adminUser.add(new Role("ROLE_ADMIN", true, true, true, true, true, true, true, true, true, true));

		User admin = new User("admin", "admin", adminUser);
		userService.save(admin);
	}

}
