package ru.stm.newsdemo.newsdemoserver.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "ND_ARTICLE")
public class Article {
	@Id
	@Column(name = "ID", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ArticleIdSequenceGenerator")
	@SequenceGenerator(sequenceName = "ND_ARTICLE_ID_SEQ", name = "ArticleIdSequenceGenerator", allocationSize = 1)
	private Long id;
	@Column(name = "TITLE", nullable = false, unique = true)
	private String title;
	@Column(name = "CONTENT", nullable = false, unique = false)
	private String content;
	@Column(name = "POSTING_DATE", nullable = false, unique = false, columnDefinition = "DATE")
	private Date posting_date;
	@ManyToOne
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPosting_date() {
		return posting_date;
	}

	public void setPosting_date(Date posting_date) {
		this.posting_date = posting_date;
	}

	public Article(String title, String content, Date posting_date, User user) {
		this.title = title;
		this.content = content;
		this.posting_date = posting_date;
		this.user = user;

	}

	public Article(String title, String content, Date posting_date) {
		this.title = title;
		this.content = content;
		this.posting_date = posting_date;

	}

	public Article() {
	}
}
