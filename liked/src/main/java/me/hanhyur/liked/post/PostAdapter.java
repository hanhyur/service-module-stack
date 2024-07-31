package me.hanhyur.liked.post;

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
