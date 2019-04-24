package kr.justmusic.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {
    @GetMapping(value = "")
    public String main() {
        return "main/index";
    }

    @GetMapping("error")
    public String error() {
        return "main/index";
    }
}
