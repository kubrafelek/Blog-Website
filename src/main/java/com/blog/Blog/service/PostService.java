package com.blog.Blog.service;

import com.blog.Blog.model.Post;
import com.blog.Blog.model.User;
import com.blog.Blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public void insert(Post post) {
        // Check date is null then return current date
        postRepository.save(post);
    }

    public List<Post> findByUser(User user) {
        return postRepository.findByUserId(user.getId());
    }

    public Optional<Post> getPost(Long id) {
        return postRepository.findById(id);
    }

    public List<Post> listPostsByUsername(String username) {
        return postRepository.findById(username);
    }

    public boolean deletePostById(Long id) {
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
