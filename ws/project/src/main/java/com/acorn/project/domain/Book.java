package com.acorn.project.domain;

import lombok.Data;

@Data
public class Book {
	
	private int id;
	private String title;
	private String author;
	private int price;
	private String cover;

	public String getCover() { return cover; }
	public void setCover(String cover) { this.cover = cover; }

}
