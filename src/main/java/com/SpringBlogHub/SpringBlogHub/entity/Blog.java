package com.SpringBlogHub.SpringBlogHub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private Long blogId;

    @Column(name = "blog_title")
    private String blogTitle;

    @Column(name = "blog_body")
    private String blogBody;

    @Column(name = "author")
    private String blogAuthor; // Should be hashed in a real-world scenario

    @Column(name = "date")
    private String blogDate;

    public Blog(Long blogId, String blogTitle, String blogBody, String blogAuthor, String blogDate) {
        this.blogId = blogId;
        this.blogTitle = blogTitle;
        this.blogBody = blogBody;
        this.blogAuthor = blogAuthor;
        this.blogDate = blogDate;
    }

    public Blog() {
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogBody() {
        return blogBody;
    }

    public void setBlogBody(String blogBody) {
        this.blogBody = blogBody;
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor;
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate;
    }
}
