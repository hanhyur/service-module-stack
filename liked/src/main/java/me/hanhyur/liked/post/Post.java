package me.hanhyur.liked.post;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

@Entity
@Table(name = "posts")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String content;
    
    private String imageUrl;
    
    private String location;
    
    public Post(String content, String imageUrl, String location) {
        Assert.hasText(imageUrl, "ImageUrl cannot be empty");
        this.content = content;
        this.imageUrl = imageUrl;
        this.location = location;
    }
    
//    public void assginId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }

}
