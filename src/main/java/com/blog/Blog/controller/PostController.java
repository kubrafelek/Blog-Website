package com.blog.Blog.controller;

import com.blog.Blog.model.Post;
import com.blog.Blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("blog/v1")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/posts")
    public List<Post> posts() {
        return postService.getAllPosts();
    }

    @GetMapping(value = "post/{id}")
    public Optional<Post> getPostById(@PathVariable Long id) {
        return postService.getPost(id);
    }

    @PostMapping(value = "/post")
    public void createPost(@RequestBody Post post) {
        postService.insert(post);
    }

    @GetMapping(value = "/posts/{username}")
    public List<Post> listPostsByUsername(@PathVariable String username){
        return postService.listPostsByUsername(username);
    }

    @DeleteMapping(value = "/post/{id}")
    public boolean deletePostById(@PathVariable Long id){
        return postService.deletePostById(id);
    }
}
