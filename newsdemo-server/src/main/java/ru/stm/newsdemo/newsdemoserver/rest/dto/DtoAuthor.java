package ru.stm.newsdemo.newsdemoserver.rest.dto;

public class DtoAuthor {
	
	private long id;
	private String name;

	public DtoAuthor(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
