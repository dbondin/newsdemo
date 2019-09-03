package ru.stm.newsdemo.newsdemoserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.stm.newsdemo.newsdemoserver.domain.Role;
import ru.stm.newsdemo.newsdemoserver.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	@Transactional(readOnly = false)
	public Role save(Role role) {
		return roleRepository.save(role);
	}

}
