package com.rich.harrison.dao;

import com.rich.harrison.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/*
* author: Harrison
* Time: 2018/11/01 15:06
* */
public interface ArticleRepository extends JpaRepository<Article,Integer>{
}
