package com.rich.harrison.controller;

import com.rich.harrison.dao.ArticleRepository;
import com.rich.harrison.entity.Article;
import com.rich.harrison.entity.IndexPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/*
*
* 两种方式可选 注册，返回类是Optional<Girl>， Optional是jdk8自带的

@GetMapping(value = "/girls/{id}")
public Optional<Girl> girlFindOne(@PathVariable("id") Integer id) {

   //直接用findById查找
   //return  girlRepository.findById(id);

   //构通Example查找

   Girl girl = new Girl();
   girl.setId(id);
   Example<Girl> example = Example.of(girl);
   return girlRepository.findOne(example);
}
*
* */

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleRepository rep;

    /*
    * 查询首页信息
    * */
    @GetMapping(value="/get")
    private Page<Article> getArticles(@RequestParam(value = "pageNum", defaultValue = "0") Integer pageNum,
                                  @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize){
        System.out.println("pageNum" + pageNum + ", pageSize="+pageSize);
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return rep.findAll(PageRequest.of(pageNum, pageSize, sort));
    }
}
