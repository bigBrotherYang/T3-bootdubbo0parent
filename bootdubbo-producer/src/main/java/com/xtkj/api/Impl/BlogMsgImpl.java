package com.xtkj.api.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xtkj.api.IBlogMsg;
import com.xtkj.dao.BlogMapper;
import com.xtkj.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
//  import com.alibaba.dubbo.config.annotation.Service;
@Service
public class BlogMsgImpl implements IBlogMsg {
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> findBlogs() {
        return blogMapper.findBlogs();
    }
}
