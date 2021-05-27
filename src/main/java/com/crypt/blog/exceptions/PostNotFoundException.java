package com.crypt.blog.exceptions;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(Long id) {
        super("Post with " + id + " not found");
    }
}
