package org.example.seom9root.controller.board;

import lombok.RequiredArgsConstructor;
import org.example.seom9root.service.board.BoardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    public String home() {
        return "Hello World!";
    }
}
