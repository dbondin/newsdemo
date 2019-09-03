package ru.stm.newsdemo.newsdemoserver.service;

import java.util.Optional;

import ru.stm.newsdemo.newsdemoserver.domain.User;

public interface UserService {

	public User save(final User user);

	public Iterable<User> findAll();

	public Optional<User> findByUsername(final String username);

	public Optional<User> findById(final Long id);

	public long count();
}
