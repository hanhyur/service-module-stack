package me.hanhyur.liked.post;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import me.hanhyur.liked.ApiTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PostApiTest extends ApiTest {

    @Test
    void createPost() {
        final var request = createPostEntity();
        
        final var response = createPostRequest(request);
        
        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }
    
    private static ExtractableResponse<Response> createPostRequest(final AddPostRequest request) {
        return RestAssured.given().log().all()
          .contentType(MediaType.APPLICATION_JSON_VALUE)
          .body(request)
          .when()
          .post("/posts")
          .then()
          .log().all().extract();
    }
    
    private static AddPostRequest createPostEntity() {
        final String content = "this is fake content";
        final String imageUrl = "Roughly speaking, the image URL";
        final String location = "Seoul, Republic of Korea";
        
        return new AddPostRequest(content, imageUrl, location);
    }
}
