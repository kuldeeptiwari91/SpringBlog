package com.SpringBlogHub.SpringBlogHub.controller;

import com.SpringBlogHub.SpringBlogHub.entity.Blog;
import com.SpringBlogHub.SpringBlogHub.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    private final BlogServices blogServices;

    @Autowired
    public BlogController(BlogServices blogServices) {
        this.blogServices = blogServices;
    }

    @GetMapping
    public List<Blog> getAllBlogs() {
        return blogServices.getAllBlogs();
    }

    @GetMapping("/{blogId}")
    public Blog getBlogById(@PathVariable Long blogId) {
        return blogServices.getBlogById(blogId).orElse(null);
    }

    @PostMapping
    public void createBlog(@RequestBody Blog blog) {
        blogServices.createBlog(blog);
    }

    @PutMapping
    public void updateBlog(@RequestBody Blog blog) {
        blogServices.updateBlog(blog);
    }

    @DeleteMapping("/{blogId}")
    public void deleteBlog(@PathVariable Long blogId) {
        blogServices.deleteBlog(blogId);
    }
}
