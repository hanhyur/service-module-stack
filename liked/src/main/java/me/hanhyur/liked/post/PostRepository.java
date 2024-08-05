package me.hanhyur.liked.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

interface PostRepository extends JpaRepository<Post, Long> {
//    private Long seq = 0L;
//    private Map<Long, Post> persistence = new HashMap<>();
//
//    public void save(Post post) {
//        post.assginId(++seq);
//        persistence.put(post.getId(), post);
//    }
}
