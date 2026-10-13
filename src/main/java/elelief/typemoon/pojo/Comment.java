package elelief.typemoon.pojo;

import java.util.Date;
import java.util.List;

public class Comment {
    private Integer commentId;
    private Integer postId;
    private String commentText;
    private String commentAuthor;
    private Date commentCreatedtime;
    private Date commentUpdatedtime;
    private Integer isDeleted;
    private Integer parentId;
    public Integer getCommentId() {return commentId;}
    public void setCommentId(Integer commentId) {this.commentId = commentId;}
    public Integer getPostId() {return postId;}
    public void setPostId(Integer postId) {this.postId = postId;}
    public String getCommentText() {return commentText;}
    public void setCommentText(String commentText) {this.commentText = commentText;}
    public String getCommentAuthor() {return commentAuthor;}
    public void setCommentAuthor(String commentAuthor) {this.commentAuthor = commentAuthor;}
    public Date getCommentCreatedtime() {return commentCreatedtime;}
    public void setCommentCreatedtime(Date commentCreatedtime) {this.commentCreatedtime = commentCreatedtime;}
    public Date getCommentUpdatedtime() {return commentUpdatedtime;}
    public void setCommentUpdatedtime(Date commentUpdatedtime) {this.commentUpdatedtime = commentUpdatedtime;}
    public Integer getIsDeleted() {return isDeleted;}
    public void setIsDeleted(Integer isDeleted) {this.isDeleted = isDeleted;}
    public Integer getParentId() {return parentId;}
    public void setParentId(Integer parentId) {this.parentId = parentId;}
}
