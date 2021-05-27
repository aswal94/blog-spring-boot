package com.crypt.blog.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class RegisterRequest {

    private String username;
    private String password;
    private String email;

}
