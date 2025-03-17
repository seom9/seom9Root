package org.example.seom9root.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.example.seom9root.domain.Board;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class BoardDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdAt;

    public static BoardDto fromEntity(Board board) {
        return BoardDto.builder()
                .id(board.getId())
                .title(board.getTitle())
                .content(board.getContent())
                .author(board.getAuthor())
                .createdAt(board.getCreatedAt())
                .build();
    }

    public static Board toEntity(BoardDto boardDto) {
        Board board = new Board();
        board.setId(boardDto.getId());
        board.setTitle(boardDto.getTitle());
        board.setContent(boardDto.getContent());
        board.setAuthor(boardDto.getAuthor());
        board.setCreatedAt(boardDto.getCreatedAt());
        return board;
    }
}
