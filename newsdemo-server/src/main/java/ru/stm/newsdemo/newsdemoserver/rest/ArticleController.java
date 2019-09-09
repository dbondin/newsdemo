package ru.stm.newsdemo.newsdemoserver.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ru.stm.newsdemo.newsdemoserver.domain.Article;
import ru.stm.newsdemo.newsdemoserver.domain.Role;
import ru.stm.newsdemo.newsdemoserver.domain.User;
import ru.stm.newsdemo.newsdemoserver.rest.dto.DtoArticle;
import ru.stm.newsdemo.newsdemoserver.rest.dto.DtoUser;
import ru.stm.newsdemo.newsdemoserver.service.ArticleService;
import ru.stm.newsdemo.newsdemoserver.service.RoleService;

@RestController
public class ArticleController {
@Autowired
ArticleService articleService;

	@RequestMapping(method = RequestMethod.GET, path = "/article/last")
	public ResponseEntity<List<DtoArticle>> getLastArticles() {
		List<DtoArticle> result = new ArrayList<>();
		for (int i = 0; i < 3; ++i) {
			result.add(new DtoArticle((long) i, "Тестовая статья " + i, "Текст тестовой статьи " + i,
					new DtoUser(i, "Автор тестовой статьи" + i), new Date()));
		}
		return new ResponseEntity<List<DtoArticle>>(result, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/article/push")
	public ResponseEntity<Iterable<Article>> pushArticle() {
		return new ResponseEntity<Iterable<Article>>(articleService.findAll(),HttpStatus.OK);
	}
}
