package elelief.typemoon.pojo;

import java.util.Date;
import java.util.List;

public class Post
{
    private Integer postId;
    private String postTitle;
    private String postContent;
    private Integer postStatus;
    private Date postCreatedtime;
    private Date postUpdatedtime;
    private String postAuthor;
    private Integer postCommentnum;
    private List<Comment> comments;
    public void setPostId(Integer postId) {this.postId = postId;}
    public void setPostAuthor(String postAuthor) {this.postAuthor = postAuthor;}
    public void setPostTitle(String postTitle) {this.postTitle = postTitle;}
    public void setPostCommentnum(Integer postCommentnum) {this.postCommentnum = postCommentnum;}
    public Integer getPostId() {return postId;}
    public Integer getPostCommentnum() {return postCommentnum;}
    public String getPostTitle() {return postTitle;}
    public String getPostAuthor() {return postAuthor;}
    public String getPostContent(){return postContent;}
    public void setPostContent(String postContent){this.postContent = postContent;}
    public Date getPostCreatedtime() {return postCreatedtime;  }
    public void setPostCreatedtime(Date postCreatedtime) {this.postCreatedtime = postCreatedtime;}
    public Date getPostUpdatedtime() {return postUpdatedtime;}
    public void setPostUpdatedtime(Date postUpdatedtime) {this.postUpdatedtime = postUpdatedtime;}
    public Integer getPostStatus() {return postStatus;}
    public void setPostStatus(Integer postStatus) {this.postStatus = postStatus;}
    public List<Comment> getComments() {return comments;}
    public void setComments(List<Comment> comments) {this.comments = comments;}
}

