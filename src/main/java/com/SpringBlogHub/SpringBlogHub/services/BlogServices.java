package com.SpringBlogHub.SpringBlogHub.services;

import com.SpringBlogHub.SpringBlogHub.entity.Blog;
import com.SpringBlogHub.SpringBlogHub.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServices {
    private final BlogRepo blogRepo;

    @Autowired
    public BlogServices(BlogRepo blogRepo) {
        this.blogRepo = blogRepo;
    }

    public void createBlog(Blog blog) {
        blogRepo.save(blog);
    }

    public List<Blog> getAllBlogs() {
        return blogRepo.findAll();
    }

    public Optional<Blog> getBlogById(Long blogId) {
        return blogRepo.findById(blogId);
    }

    public void updateBlog(Blog blog) {
        // Assuming the blogId is not null
        blogRepo.save(blog);
    }

    public void deleteBlog(Long blogId) {
        blogRepo.deleteById(blogId);
    }
}
