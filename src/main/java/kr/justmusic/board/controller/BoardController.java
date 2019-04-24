package kr.justmusic.board.controller;

import kr.justmusic.board.model.Article;
import kr.justmusic.board.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("board")
public class BoardController {
    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "list")
    public String list(Model model) {
        List<Article> articleList = articleService.getArticleList();
        model.addAttribute("articleList", articleList);
        return "board/list";
    }

    @GetMapping(value = "write")
    public String write() {
        return "board/write";
    }

    @PostMapping(value = "write")
    public String write(@ModelAttribute Article article) {
        articleService.insertArticle(article);
        return "redirect:/board/list";
    }
}
