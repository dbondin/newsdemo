package ru.stm.newsdemo.newsdemoserver.repositories;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.stm.newsdemo.newsdemoserver.domain.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByUsername(String username);
	Optional<User> findById(Long id);
	List<User> findByPassword(String password);

}
