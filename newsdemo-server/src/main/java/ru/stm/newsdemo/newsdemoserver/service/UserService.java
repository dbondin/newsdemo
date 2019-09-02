package ru.stm.newsdemo.newsdemoserver.service;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.stm.newsdemo.newsdemoserver.domain.Role;
import ru.stm.newsdemo.newsdemoserver.domain.User;
import ru.stm.newsdemo.newsdemoserver.repositories.UserRepository;

@Service
public class UserService {
private Set<Role>roles=new HashSet<>();
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = false)
	public User save(final User user) {
		return userRepository.save(user);
	}
	
	@Transactional(readOnly = true)
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Optional<User> findByUsername(final String username) {
		return userRepository.findByUsername(username);
	}
	
	@Transactional(readOnly = true)
	public Optional<User> findById(final Long id) {
		return userRepository.findById(id);
	}
//public void addRole(Role role) {
//		roles.add( role );
//		role.getUsers().add( this );
//	}

	//public void removeRole(Role role) {
	//	roles.remove( role );
	//	role.getUsers().remove( this );
	//	
		
	//}

}
