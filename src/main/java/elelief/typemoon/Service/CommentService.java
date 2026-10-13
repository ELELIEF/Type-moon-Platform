package elelief.typemoon.Service;

import elelief.typemoon.pojo.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> getCommentReplies(int id);
    public Integer submitComment(Comment comment, int parentId);
}
