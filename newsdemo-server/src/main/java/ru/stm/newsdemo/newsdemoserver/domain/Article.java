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
	@Column(name = "TITLE", nullable = false, unique = false)
	private String title;
	@Column(name = "CONTENT", nullable = false, unique = false)
	private String content;
	@Column(name = "POSTING_DATE", nullable = false, unique = false)
	private Date postingDate;
	@ManyToOne
	private User author;

	public User getUser() {
		return author;
	}

	public void setUser(User user) {
		this.author = user;
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
		return postingDate;
	}

	public void setPosting_date(Date posting_date) {
		this.postingDate = posting_date;
	}

	public Article(String title, String content, Date posting_date, User author) {
		this.title = title;
		this.content = content;
		this.postingDate = posting_date;
		this.author = author;

	}

	public Article(String title, String content, Date postingDate) {
		this.title = title;
		this.content = content;
		this.postingDate = postingDate;

	}

	public Article() {
	}
}
