package ru.stm.newsdemo.newsdemoserver.rest;

import java.security.Principal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ru.stm.newsdemo.newsdemoserver.domain.User;
import ru.stm.newsdemo.newsdemoserver.rest.dto.DtoUser;
import ru.stm.newsdemo.newsdemoserver.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/user/current")
	public ResponseEntity<DtoUser> getCurrentUser(final Principal principal) {
		DtoUser result = null;
		final Optional<User> ou = (principal != null) ? userService.findByUsername(principal.getName()) : Optional.empty();
		if(ou.isPresent()) {
			User u = ou.get();
			result = new DtoUser(u.getId(), u.getUsername());
		}
		return (result == null) ? new ResponseEntity<DtoUser>(HttpStatus.NOT_FOUND)
				: new ResponseEntity<DtoUser>(result, HttpStatus.OK);
	}
}
