package ru.stm.newsdemo.newsdemoserver.repositories;

import java.math.BigInteger;

import ru.stm.newsdemo.newsdemoserver.domain.User;

public interface UserRepositoryCustom {
public int updateUser(BigInteger ID,String USERNAME,String PASSWORD);
void deleteUser(BigInteger ID);
User getUserById(BigInteger ID);
}

