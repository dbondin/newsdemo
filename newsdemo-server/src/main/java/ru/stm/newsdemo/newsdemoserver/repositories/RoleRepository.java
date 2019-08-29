package ru.stm.newsdemo.newsdemoserver.repositories;
import org.springframework.data.repository.CrudRepository;

import ru.stm.newsdemo.newsdemoserver.domain.Role;
public interface RoleRepository extends CrudRepository<Role,Long> {

}
