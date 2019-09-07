package ru.stm.newsdemo.newsdemoserver.rest.dto;

import java.util.Date;

import ru.stm.newsdemo.newsdemoserver.domain.User;

public class DtoArticle {
	
	private long id;
	private String title;
	private String content;
	private DtoUser author;
	private Date date;
	
	public DtoArticle(long id, String title, String content, DtoUser author, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
		this.date = date;
	}
	
	public DtoUser getAuthor() {
		return author;
	}
	
	public String getContent() {
		return content;
	}
	
	public Date getDate() {
		return date;
	}
	
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(DtoUser author) {
		this.author = author;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}
