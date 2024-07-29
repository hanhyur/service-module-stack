package me.hanhyur.liked.board;

import org.springframework.util.Assert;

class Post {
    private Long id;
    private final String content;
    private final String imageUrl;
    private final String location;
    
    public Post(String content, String imageUrl, String location) {
        Assert.hasText(imageUrl, "ImageUrl cannot be empty");
        this.content = content;
        this.imageUrl = imageUrl;
        this.location = location;
    }
    
    public void assginId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }
}
