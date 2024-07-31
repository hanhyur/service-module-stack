package me.hanhyur.liked.post;

import org.springframework.stereotype.Component;

@Component
class PostAdapter implements PostPort {
    private final PostRepository postRepository;
    
    PostAdapter(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    
    @Override
    public void save(Post post) {
        postRepository.save(post);
    }
}
