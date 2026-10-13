package elelief.typemoon.Service.impl;

import elelief.typemoon.Service.PostService;
import elelief.typemoon.mapper.PostMapper;
import elelief.typemoon.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Service
public class PostServiceimpl implements PostService {
    @Autowired
    private PostMapper postMapper;
    private static final Instant now= ZonedDateTime.now(ZoneId.of("Asia/Shanghai")).toInstant();
    private static Date time =Date.from(now);
    public List<Post> getPosts()
    {
        List<Post> listpost= postMapper.getPosts();
        return listpost;
    }
    public Post getPostDetail(int postId)
    {
        Post postdetail=postMapper.getPostDetail(postId);
        return postdetail;
    }
    public Integer submitPost(Post post)
    {
        if(post!=null) {
            post.setPostStatus(1);
            post.setPostCreatedtime(time);
            post.setPostUpdatedtime(time);
            Integer r = postMapper.submitPost(post);
            return r;
        }
        else{
            return 0;
        }
    }
}
