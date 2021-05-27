package com.crypt.blog.config;

import com.crypt.blog.entities.Post;
import com.crypt.blog.respositories.PostRepository;
import com.crypt.faker.BlogFaker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class DBSeeder {

    @Bean
    CommandLineRunner init(PostRepository postRepository) {
        return args -> {
            postRepository.save(new Post().setTitle("Post 1").setBody("body of psot 1").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
            postRepository.save(new Post().setTitle("Post 2").setBody("body of psot 2").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
            postRepository.save(new Post().setTitle("Post 3").setBody("body of psot 3").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
            postRepository.save(new Post().setTitle("Post 4").setBody("body of psot 4").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
            postRepository.save(new Post().setTitle("Post 5").setBody("body of psot 5").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
            postRepository.save(new Post().setTitle("Post 6").setBody("body of psot 6").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
            postRepository.save(new Post().setTitle("Post 7").setBody("body of psot 7").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
            postRepository.save(new Post().setTitle("Post 8").setBody("body of psot 8").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
            postRepository.save(new Post().setTitle("Post 9").setBody("body of psot 9").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
            postRepository.save(new Post().setTitle("Post 9").setBody("body of psot 9").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
            postRepository.save(new Post().setTitle("Post 10").setBody("body of psot 10").setCreatedBy(1l).setCreatedAt(LocalDateTime.now()).setUpdatedAt(LocalDateTime.now()));
        };
    }
}
