package com.sirius.tech.learn.dto;

import java.util.List;

import com.sirius.tech.learn.entity.Author;

public class ArticleMediumDTO extends ArticleBasicDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Author> authors;
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

}
