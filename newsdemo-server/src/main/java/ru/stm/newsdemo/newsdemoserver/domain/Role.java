package ru.stm.newsdemo.newsdemoserver.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ND_ROLES")

public class Role {
    @Id
    @Column(name="ID",nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RoleIdSequenceGenerator")
	@SequenceGenerator(sequenceName = "ND_ROLES_ID_SEQ", name = "RoleIdSequenceGenerator", allocationSize = 1)
    private Long id;
    @Column(name="NAME",nullable = false, unique = true)
    private String name;
    @Column (name="CAN_CREATE_NEW_ARTICLE",nullable=false,unique=true)
    private boolean canCreateNewArticle;
    @Column (name="CAN_MODIFY_OWN_ARTICLE",nullable=false,unique=true)
    private boolean canModifyOwnArticle;
    @Column (name="CAN_DELETE_ARTICLE",nullable=false,unique=true)
    private boolean canDeleteArticle;
    @Column (name="CAN_MODIFY_ARTICLE",nullable=false,unique=true)
    private boolean canModifyArticle;
    @Column (name="CAN_ADD_USER",nullable=false,unique=true)
    private boolean canAddUser;
    @Column (name="CAN_DELETE_USER",nullable=false,unique=true)
    private boolean canDeleteUser;
    @Column (name="CAN_MODIFY_USER",nullable=false,unique=true)
    private boolean canModifyUser;
    @Column (name="CAN_CREATE_ROLE",nullable=false,unique=true)
    private boolean canCreateRole;
    @Column (name="CAN_DELETE_ROLE",nullable=false,unique=true)
    private boolean canDeleteRole;
    @Column (name="CAN_MODIFY_ROLE",nullable=false,unique=true)
    private boolean canModifyRole;

    public boolean isCanCreateNewArticle() {
		return canCreateNewArticle;
	}

	public void setCanCreateNewArticle(boolean canCreateNewArticle) {
		this.canCreateNewArticle = canCreateNewArticle;
	}

	public boolean isCanModifyOwnArticle() {
		return canModifyOwnArticle;
	}

	public void setCanModifyOwnArticle(boolean canModifyOwnArticle) {
		this.canModifyOwnArticle = canModifyOwnArticle;
	}

	public boolean isCanDeleteArticle() {
		return canDeleteArticle;
	}

	public void setCanDeleteArticle(boolean canDeleteArticle) {
		this.canDeleteArticle = canDeleteArticle;
	}

	public boolean isCanModifyArticle() {
		return canModifyArticle;
	}

	public void setCanModifyArticle(boolean canModifyArticle) {
		this.canModifyArticle = canModifyArticle;
	}

	public boolean isCanAddUser() {
		return canAddUser;
	}

	public void setCanAddUser(boolean canAddUser) {
		this.canAddUser = canAddUser;
	}

	public boolean isCanDeleteUser() {
		return canDeleteUser;
	}

	public void setCanDeleteUser(boolean canDeleteUser) {
		this.canDeleteUser = canDeleteUser;
	}

	public boolean isCanModifyUser() {
		return canModifyUser;
	}

	public void setCanModifyUser(boolean canModifyUser) {
		this.canModifyUser = canModifyUser;
	}

	public boolean isCanCreateRole() {
		return canCreateRole;
	}

	public void setCanCreateRole(boolean canCreateRole) {
		this.canCreateRole = canCreateRole;
	}

	public boolean isCanDeleteRole() {
		return canDeleteRole;
	}

	public void setCanDeleteRole(boolean canDeleteRole) {
		this.canDeleteRole = canDeleteRole;
	}

	public boolean isCanModifyRole() {
		return canModifyRole;
	}

	public void setCanModifyRole(boolean canModifyRole) {
		this.canModifyRole = canModifyRole;
	}

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
    public Role() {}
public Role(String name, boolean canCreateNewArticle,boolean canModifyOwnArticle,boolean canDeleteArticle, boolean canModifyArticle, boolean canAddUser, boolean canDeleteUser, boolean canModifyUser, boolean canCreateRole, boolean canDeleteRole, boolean canModifyRole) {
	this.name=name;
	this.canAddUser=canAddUser;
	this.canCreateNewArticle=canCreateNewArticle;
	this.canCreateRole=canCreateRole;
	this.canDeleteArticle=canDeleteArticle;
	this.canDeleteRole=canDeleteRole;
	this.canDeleteUser=canDeleteUser;
	this.canModifyArticle=canModifyArticle;
	this.canModifyOwnArticle=canModifyOwnArticle;
	this.canModifyRole=canModifyRole;
	this.canModifyUser=canModifyUser;
}
}
