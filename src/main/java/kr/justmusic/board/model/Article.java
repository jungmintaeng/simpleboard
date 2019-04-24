package kr.justmusic.board.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("article")
public class Article {
    private Long no;
    private String content;
    private String title;
    private String writer;
}
