package com.crypt.blog.controllers;

import com.crypt.blog.dto.PostRequest;
import com.crypt.blog.entities.Post;
import com.crypt.blog.response.PostListResponse;
import com.crypt.blog.response.Response;
import com.crypt.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public ResponseEntity<PostListResponse> allPosts() {

        PostListResponse response = new PostListResponse();
        response.setData(postService.getAllPost());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/posts")
    public ResponseEntity<Post> createPost(@RequestBody PostRequest postRequest) {
        Post post = postService.createPost(postRequest);
        return new ResponseEntity<Post>(post, HttpStatus.OK);
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<Post> singlePost(@PathVariable Long id) {
        Post post = postService.getPost(id);
        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    @GetMapping("/posts/pagination")
    public List<Post> paginatedPosts() {
        return postService.findByCreatedAt(1l);
    }

    @GetMapping("/posts/filter")
    public String getFilteredPosts(@RequestParam(value = "type", required = false, defaultValue = "test") String type, @RequestParam Long id) {
        return type + ", " + id;
    }

    // https://www.baeldung.com/spring-request-param
}
