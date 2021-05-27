package com.crypt.blog.services;

import com.crypt.blog.dto.PostRequest;
import com.crypt.blog.entities.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    List<Post> getAllPost();

    Post getPost(Long id);

    List<Post> findByCreatedAt(Long id);

    Post createPost(PostRequest postRequest);
}
