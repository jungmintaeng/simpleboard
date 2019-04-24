package kr.justmusic.board.repository;

import kr.justmusic.board.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleMapper {
    Article selectOne(Long id);
    List<Article> selectAll();
    void insert(Article article);
}
