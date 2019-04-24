package kr.justmusic.board.service;

import kr.justmusic.board.model.Article;
import kr.justmusic.board.repository.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> getArticleList() {
        return articleMapper.selectAll();
    }

    public Boolean insertArticle(Article article) {
        if (article == null || article.getTitle() == null || article.getWriter() == null || article.getContent() == null) {
            return false;
        }

        if (article.getTitle().length() == 0 || article.getWriter().length() == 0 || article.getContent().length() == 0) {
            return false;
        }

        articleMapper.insert(article);

        return true;
    }
}
