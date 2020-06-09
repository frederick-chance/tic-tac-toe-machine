package com.tictactoe.machine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicTacToeController {

    private TicTacToeService service;

    @Autowired
    public TicTacToeController(TicTacToeService service) {
        this.service = service;
    }

    @GetMapping
    public String getNextMove(String boardstate) {
        return this.service.getNextMove(boardstate);
    }

    @PostMapping
    public String postResults(String boardstate) {
        return this.service.updateResults(boardstate);
    }
}