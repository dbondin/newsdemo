package ru.stm.newsdemo.newsdemoserver;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ru.stm.newsdemo.newsdemoserver.domain.User;
import ru.stm.newsdemo.newsdemoserver.domain.Role;
import ru.stm.newsdemo.newsdemoserver.service.RoleService;
import ru.stm.newsdemo.newsdemoserver.service.UserService;
import ru.stm.newsdemo.newsdemoserver.service.UserServiceImpl;

@Component
public class DefaultUserChecker {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;

	@PostConstruct
	private void postConstruct() {
		if (userService.count() == 0) {
			final Role roleAdmin = roleService.save(new Role("ROLE_ADMIN", true, true, true, true, true, true, true, true, true, true));
			roleService.save(new Role("ROLE_MODERATOR", true, true, true, true, true, false, false, false, false, false));
			roleService.save(new Role("ROLE_AUTHOR", true, true, false, false, false, false, false, false, false, false));
			final User admin = new User("admin", "admin", Collections.singleton(roleAdmin));
			userService.save(admin);
		}
	}
}
