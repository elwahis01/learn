package com.sirius.tech.learn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirius.tech.learn.dao.ArticleRepository;
import com.sirius.tech.learn.dto.ArticleBasicDTO;
import com.sirius.tech.learn.dto.ArticleFullDTO;
import com.sirius.tech.learn.entity.Article;
import com.sirius.tech.learn.service.IArticleService;

@Service
public class ArticleServiceImpl
		extends AbstractLearnServiceImpl<Article, ArticleBasicDTO, ArticleFullDTO, ArticleRepository>
		implements IArticleService {

	@Autowired
	private ArticleRepository articleRepository;

	public ArticleServiceImpl() {
		super(Article.class, ArticleBasicDTO.class, ArticleFullDTO.class);
	}

	@Override
	public ArticleRepository getDAO() {
		return this.articleRepository;
	}

}
