package ru.stm.newsdemo.newsdemoserver.domain;

import java.util.Date;

public class PushArticleRequestBody {

	private String title;
	private String content;
	private Date date;
	private User author;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public PushArticleRequestBody(String title, String content,Date date, User author) {
		this.title = title;
		this.content = content;
		this.date=date;
		this.author=author;
	}
}
