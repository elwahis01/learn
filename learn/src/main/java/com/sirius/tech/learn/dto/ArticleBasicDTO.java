package com.sirius.tech.learn.dto;

import java.util.Date;

public class ArticleBasicDTO implements IDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	private String description;
	private Date publishDate;
	private Date lastReview;
	
	public ArticleBasicDTO() {
	}
	
	@Override
	public Long getId() {
		return this.id;
	}
	@Override
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Date getLastReview() {
		return lastReview;
	}
	public void setLastReview(Date lastReview) {
		this.lastReview = lastReview;
	}
	
	

}
