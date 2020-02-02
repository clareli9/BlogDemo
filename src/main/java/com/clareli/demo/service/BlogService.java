package com.clareli.demo.service;

import com.clareli.demo.po.Blog;
import com.clareli.demo.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {

    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);  // id is primary key

    void deleteBlog(Long id);
}
