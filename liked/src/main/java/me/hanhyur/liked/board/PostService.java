package me.hanhyur.liked.board;

class PostService {
    private final PostPort postPort;
    
    PostService(PostPort postPort) {
        this.postPort = postPort;
    }
    
    public void addPost(AddPostRequest request) {
        final Post post = new Post(request.content(), request.imageUrl(), request.location());
        
        postPort.save(post);
    }
}
