package me.hanhyur.liked.post;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostServiceTest {
    
    private PostService postService;
    private PostPort postPort;
    private PostRepository postRepository;
    
    @BeforeEach
    void setUp() {
        postRepository = new PostRepository();
        postPort = new PostAdapter(postRepository);
        postService = new PostService(postPort);
    }
    
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
