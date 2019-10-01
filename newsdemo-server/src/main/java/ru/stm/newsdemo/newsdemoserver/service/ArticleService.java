package ru.stm.newsdemo.newsdemoserver.service;

import java.util.Optional;

import ru.stm.newsdemo.newsdemoserver.domain.Article;

public interface ArticleService {
	public Article save(final Article article);

	public Iterable<Article> findAll();

	public Optional<Article> findByTitle(final String title);

	public Optional<Article> findById(final Long id);

	public long count();
}
