package com.sirius.tech.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sirius.tech.learn.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

}
