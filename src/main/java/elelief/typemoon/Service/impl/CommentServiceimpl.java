package elelief.typemoon.Service.impl;

import elelief.typemoon.Service.CommentService;
import elelief.typemoon.mapper.CommentMapper;
import elelief.typemoon.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Service
public class CommentServiceimpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    private static final Instant now= ZonedDateTime.now(ZoneId.of("Asia/Shanghai")).toInstant();
    private static Date time =Date.from(now);
    public List<Comment> getCommentReplies(int id) {
      return  commentMapper.getCommentReplies(id);
    }
    public Integer submitComment(Comment comment,int parentId) {
        if(comment!=null) {
                comment.setParentId(parentId);
                comment.setIsDeleted(1);
                comment.setCommentCreatedtime(time);
                comment.setCommentUpdatedtime(time);
                Integer r=commentMapper.submitComment(comment);
                return r;
        }
        else return 0;
    }

}
