package me.hanhyur.liked.post;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostServiceTest {

    @Autowired
    private PostService postService;
    
    @Test
    void createPost() {
        final AddPostRequest request = createPostEntity();
        
        postService.addPost(request);
    }
    
    private static AddPostRequest createPostEntity() {
        final String content = "this is fake content";
        final String imageUrl = "Roughly speaking, the image URL";
        final String location = "Seoul, Republic of Korea";
        
        return new AddPostRequest(content, imageUrl, location);
    }
}
