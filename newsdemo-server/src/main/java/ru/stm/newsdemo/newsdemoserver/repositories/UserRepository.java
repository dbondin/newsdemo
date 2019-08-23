package ru.stm.newsdemo.newsdemoserver.repositories;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.stm.newsdemo.newsdemoserver.domain.User;
@Repository
public interface UserRepository extends CrudRepository<User, BigInteger> {
	List<User> findByUSERNAME(String USERNAME);
	List<User> findByID(BigInteger ID);
	List<User> findByPASSWORD(String PASSWORD);

}
