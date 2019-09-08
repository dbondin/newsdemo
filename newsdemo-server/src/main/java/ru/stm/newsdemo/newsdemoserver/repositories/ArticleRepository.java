package ru.stm.newsdemo.newsdemoserver.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ru.stm.newsdemo.newsdemoserver.domain.Article;

public interface ArticleRepository extends CrudRepository<Article,Long>{
	Optional<Article> findByTitle(String title);
}
