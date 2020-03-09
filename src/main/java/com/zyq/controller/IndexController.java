package com.zyq.controller;

import com.zyq.domain.condition;
import com.zyq.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Configuration
@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping("/index")
    public List<condition> index(){
        List list = new ArrayList();
        list = indexService.index();
        return list;
    }
}
