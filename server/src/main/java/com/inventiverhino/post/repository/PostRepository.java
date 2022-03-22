package com.inventiverhino.post.repository;

import com.inventiverhino.post.pojo.Post;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PostRepository extends ReactiveMongoRepository<Post, String> {
}
