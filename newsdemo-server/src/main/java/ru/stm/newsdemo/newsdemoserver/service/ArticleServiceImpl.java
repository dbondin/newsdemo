package ru.stm.newsdemo.newsdemoserver.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.stm.newsdemo.newsdemoserver.domain.Article;
import ru.stm.newsdemo.newsdemoserver.repositories.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleRepository articleRepository;

	@Override
	@Transactional(readOnly = false)
	public Article save(Article article) {

		return articleRepository.save(article);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Article> findAll() {

		return articleRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Article> findByTitle(String title) {

		return articleRepository.findByTitle(title);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Article> findById(Long id) {

		return articleRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public long count() {

		return articleRepository.count();
	}

}
