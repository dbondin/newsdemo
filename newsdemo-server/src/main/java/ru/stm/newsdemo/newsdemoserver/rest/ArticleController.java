package ru.stm.newsdemo.newsdemoserver.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.stm.newsdemo.newsdemoserver.domain.Article;
import ru.stm.newsdemo.newsdemoserver.domain.PushArticleRequestBody;
import ru.stm.newsdemo.newsdemoserver.domain.User;
import ru.stm.newsdemo.newsdemoserver.rest.dto.DtoArticle;
import ru.stm.newsdemo.newsdemoserver.rest.dto.DtoUser;
import ru.stm.newsdemo.newsdemoserver.service.ArticleService;
import ru.stm.newsdemo.newsdemoserver.service.UserService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<DtoArticle>> doGet() {
		List<DtoArticle> result = new ArrayList<>();
		articleService.findAll().forEach(a -> {
			result.add(new DtoArticle(a.getId(), a.getTitle(), a.getContent(),
					new DtoUser(a.getUser().getId(), a.getUser().getUsername()), a.getPostingDate()));
		});
		return ResponseEntity.ok().body(result);
	}

	@PostMapping(consumes= { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE } )
	public ResponseEntity<Void> doPost(Principal currentUser, @RequestBody(required = true) PushArticleRequestBody body)
			throws URISyntaxException {

		final User user = userService.findByUsername(currentUser.getName())
				.orElseThrow(() -> new RuntimeException("Bad current user"));

		final Article article = new Article();
		article.setPostingDate(new Date());
		article.setUser(user);
		article.setTitle(body.getTitle());
		article.setContent(body.getContent());

		articleService.save(article);

		return ResponseEntity.created(new URI("http://todo")).build();
	}
}
