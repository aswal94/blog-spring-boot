package com.crypt.blog.services.impl;

import com.crypt.blog.dto.PostRequest;
import com.crypt.blog.entities.Post;
import com.crypt.blog.exceptions.PostNotFoundException;
import com.crypt.blog.respositories.PostRepository;
import com.crypt.blog.services.AuthService;
import com.crypt.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private AuthService authService;

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post getPost(Long id) {
        return postRepository.findById(id).orElseThrow(() -> new PostNotFoundException(id));
    }

    @Override
    public List<Post> findByCreatedAt(Long id) {
        Pageable pageable = PageRequest.of(0, 2);
        return postRepository.findAllByCreatedBy(id, pageable);
    }

    @Override
    public Post createPost(PostRequest postRequest) {
        Post post = new Post()
                .setTitle(postRequest.getTitle())
                .setBody(postRequest.getBody())
                .setCreatedBy(postRequest.getCreatedBy());
        User u = authService.getCurrentUser().orElseThrow(() -> new UsernameNotFoundException("User not found"));
        //post.setCreatedBy(u.getUsername());
        post.setCreatedBy(1L);
        post.setCreatedAt(LocalDateTime.now());

        return postRepository.save(post);
    }
}
