package ru.stm.newsdemo.newsdemoserver.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ND_USERS_ROLES")

public class Role {
    @Id
    @Column(name="ID",nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UserIdSequenceGenerator")
	@SequenceGenerator(sequenceName = "ND_USERS_ROLES_ID_SEQ", name = "UserIdSequenceGenerator", allocationSize = 1)
    private Long id;
    @Column(name="NAME",nullable = false, unique = true)
    private String name;

   
  @ManyToMany(mappedBy="roles")
    private Set<User> users;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
