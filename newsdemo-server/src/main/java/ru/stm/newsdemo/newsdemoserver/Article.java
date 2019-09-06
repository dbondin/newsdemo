package ru.stm.newsdemo.newsdemoserver;

import java.util.Date;

import ru.stm.newsdemo.newsdemoserver.domain.User;

public class Article implements Comparable<Article> {
	private String title;
	private String content;
	private User author;
	private Date date;

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

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
public void prt() {
	System.out.println(this.getTitle()+" "+this.getContent()+" "+this.getAuthor()+" "+this.getDate());
}
	public Article(String title, String content, User author, Date date) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.date = date;
	}

	@Override
	public int compareTo(Article o) {
		return getDate().compareTo(o.getDate());
	}
}
