package com.inventiverhino.post.repository;

import com.inventiverhino.post.pojo.Comment;
import com.inventiverhino.post.pojo.PostId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CommentRepository extends ReactiveMongoRepository<Comment, String> {

    Flux<Comment> findByPost(PostId id);

}
