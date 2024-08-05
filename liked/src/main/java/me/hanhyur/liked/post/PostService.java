package me.hanhyur.liked.post;

import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
class PostService {
    private final PostPort postPort;
    
    PostService(final PostPort postPort) {
        this.postPort = postPort;
    }
    
    @PostMapping
    @Transactional
    public ResponseEntity<Void> addPost(@RequestBody final AddPostRequest request) {
        final Post post = new Post(request.content(), request.imageUrl(), request.location());
        
        postPort.save(post);
        
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
