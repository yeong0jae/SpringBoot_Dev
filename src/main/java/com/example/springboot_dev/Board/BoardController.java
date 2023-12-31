package com.example.springboot_dev.Board;

import com.example.springboot_dev.Board.Data.BoardRequestDTO;
import com.example.springboot_dev.Board.Data.BoardResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/posts") // 전체 게시글 조회
    public List<BoardResponseDTO> getPostList() {
        return boardService.getPostList();
    }

    @PostMapping("/posts") // 게시글 등록
    public void saveBoard(@RequestBody BoardRequestDTO boardRequestDTO) {
        boardService.saveBoard(boardRequestDTO);
    }

    @PutMapping("/posts/{id}") // 게시글 수정
    public void updateBoard(@PathVariable("id") Long id, @RequestBody BoardRequestDTO boardRequestDTO) {
        // 게시글 수정 위한 dto 만들어야함
    }

    @DeleteMapping("/posts/{id}") // 게시글 삭제
    public void deleteBoard(@PathVariable("id") Long id) {
        boardService.deleteBoard(id);
    }

//    @GetMapping("/board/posts/{id}") // 게시글 상세조회
//    public BoardResponseDTO getBoard(@PathVariable("id") Long id) {
//        return boardService.getBoard(id);
//    }


}
