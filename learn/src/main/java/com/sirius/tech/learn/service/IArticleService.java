package com.sirius.tech.learn.service;

import com.sirius.tech.learn.dao.ArticleRepository;
import com.sirius.tech.learn.dto.ArticleBasicDTO;
import com.sirius.tech.learn.dto.ArticleFullDTO;
import com.sirius.tech.learn.entity.Article;

public interface IArticleService extends IAbstractLearnService<Article, ArticleBasicDTO, ArticleFullDTO, ArticleRepository>{

}
