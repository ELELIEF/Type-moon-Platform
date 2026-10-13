package elelief.typemoon.mapper;

import elelief.typemoon.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    public List<Comment> getCommentReplies(int id);
    public Integer submitComment(Comment comment);

}
