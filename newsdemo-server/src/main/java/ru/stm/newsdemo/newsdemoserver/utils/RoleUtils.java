package ru.stm.newsdemo.newsdemoserver.utils;

import java.util.Set;

import ru.stm.newsdemo.newsdemoserver.domain.Role;

public class RoleUtils {
	public static boolean isCanCreateNewArticle(Set<Role> roles) {
		return roles.stream().anyMatch(r -> r.isCanCreateNewArticle());
	}
}
