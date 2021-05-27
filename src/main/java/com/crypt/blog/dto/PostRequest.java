package com.crypt.blog.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {
    private Long id;
    private String title;
    private String body;
    private Long createdBy;
}
