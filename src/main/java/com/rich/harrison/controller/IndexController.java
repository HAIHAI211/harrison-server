package com.rich.harrison.controller;

import com.rich.harrison.dao.IndexRepository;
import com.rich.harrison.entity.IndexPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/index")
public class IndexController {
    @Autowired
    IndexRepository rep;

    /*
    * 查询首页信息
    * */
    @GetMapping(value="/getInfo")
    private IndexPage getInfo(){
        Optional<IndexPage> indexPageOptional= rep.findById(0);
        return indexPageOptional.isPresent() ? indexPageOptional.get(): null;
    }

}
