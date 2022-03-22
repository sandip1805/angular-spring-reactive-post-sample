package com.inventiverhino.post.exception;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String id) {
        super("Post:" + id +" is not found.");
    }
}
