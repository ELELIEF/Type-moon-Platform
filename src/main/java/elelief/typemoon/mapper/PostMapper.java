package elelief.typemoon.mapper;

import elelief.typemoon.pojo.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> getPosts();
    Post getPostDetail(int postId);
    Integer submitPost(Post post);
}
