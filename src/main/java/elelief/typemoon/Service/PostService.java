package elelief.typemoon.Service;

import elelief.typemoon.pojo.Post;

import java.util.List;

public interface PostService {
    public List<Post> getPosts();
    public Post getPostDetail(int postId);
    public Integer submitPost(Post post);
}
