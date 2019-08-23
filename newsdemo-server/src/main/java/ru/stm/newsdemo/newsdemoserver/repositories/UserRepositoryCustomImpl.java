package ru.stm.newsdemo.newsdemoserver.repositories;

import java.math.BigInteger;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.stm.newsdemo.newsdemoserver.domain.User;
@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {
@Autowired
EntityManager entityManager;
	@Override
	public int updateUser(BigInteger ID, String USERNAME, String PASSWORD) {
		User u=entityManager.find(User.class, ID);
		if(u==null) {
			return 0;
		}
		u.setID(ID);
		u.setUSERNAME(USERNAME);
		u.setPASSWORD(PASSWORD);
		return 1;
	}
	@Override
	public void deleteUser(BigInteger ID) {
		entityManager.remove(getUserById(ID));
		
	}
	@Override
	public User getUserById(BigInteger ID) {
		return entityManager.find(User.class, ID);
		
	}

}
