package com.xtkj.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xtkj.api.IBlogMsg;
import com.xtkj.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    @Reference(timeout = 10000)
    private IBlogMsg blogMsg;

    @RequestMapping("blog/blogs")
    public List<Blog> getBlgos(){
        return blogMsg.findBlogs();
    }

}
