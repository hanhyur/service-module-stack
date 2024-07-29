package me.hanhyur.liked.board;

import java.util.HashMap;
import java.util.Map;

class PostRepository {
    private Long seq = 0L;
    private Map<Long, Post> persistence = new HashMap<>();
    
    public void save(Post post) {
        post.assginId(++seq);
        persistence.put(post.getId(), post);
    }
}
