package me.hanhyur.liked.post;

import org.springframework.util.Assert;

record AddPostRequest(String content, String imageUrl, String location) {
    AddPostRequest {
        Assert.hasText(imageUrl, "ImageUrl cannot be empty");
    }
}
