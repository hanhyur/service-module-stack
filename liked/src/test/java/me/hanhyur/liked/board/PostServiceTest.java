package me.hanhyur.liked.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class PostServiceTest {
    
    private PostService postService;
    
    @BeforeEach
    void setUp() {
        postService = new PostService();
    }
    
    @Test
    void createBoard() {
        final String content = "this is fake content";
        final String imageUrl = "image";
        final AddPostRequest request = new AddPostRequest(content, imageUrl);
       
        postService.addPost(request);
    }
    
    private static class PostService {
        public void addPost(AddPostRequest request) {
        
        }
    }
    
    private record AddPostRequest(String title, String image) {
        private AddPostRequest {
            Assert.hasText(image, "Image cannot be empty");
        }
    }
}
