package ru.stm.newsdemo.newsdemoserver;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.stm.newsdemo.newsdemoserver.domain.User;
import ru.stm.newsdemo.newsdemoserver.service.UserService;

@RestController
public class MainController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/hello")
	public String printUserInfo(Principal principal) {

		User u = userService.findByUsername(principal.getName()).get();
		return u.toString();

	}

	@RequestMapping(value = "/hello")
	public List<Article> showArticles() {
		List<Article> articles = new ArrayList<>();
		Collections.sort(articles);
		for (Article a : articles) {
			a.prt();
		}
		return articles;
	}
}
