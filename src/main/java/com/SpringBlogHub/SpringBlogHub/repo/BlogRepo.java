package com.SpringBlogHub.SpringBlogHub.repo;


import com.SpringBlogHub.SpringBlogHub.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog,Long> {


}

