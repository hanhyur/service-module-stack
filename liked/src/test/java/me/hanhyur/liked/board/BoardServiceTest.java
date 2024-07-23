package me.hanhyur.liked.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class BoardServiceTest {
    
    private BoardService boardService;
    
    @BeforeEach
    void setUp() {
        boardService = new BoardService();
    }
    
    @Test
    void createBoard() {
        final String title = "title";
        final String image = "image";
        final AddBoardRequest request = new AddBoardRequest(title, image);
       
        boardService.addBoard(request);
    }
    
    private static class BoardService {
        public void addBoard(AddBoardRequest request) {
        
        }
    }
    
    private record AddBoardRequest(String title, String image) {
        private AddBoardRequest {
            Assert.hasText(title, "Title cannot be empty");
            Assert.hasText(image, "Image cannot be empty");
        }
    
    }
}
