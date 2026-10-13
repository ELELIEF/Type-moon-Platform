package elelief.typemoon.Controller;

import elelief.typemoon.Service.PostService;
import elelief.typemoon.pojo.Post;
import elelief.typemoon.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/list")
    public Result getPosts()
    {
        return Result.success(postService.getPosts());
    }
    @GetMapping("/detail")
    public Result getPostDetail(int id)
    {
        return Result.success(postService.getPostDetail(id));
    }

    @PostMapping("/submit")
    public Result submitPost(@RequestBody Post post)
    {
        Integer r=postService.submitPost(post);
        return r>0?Result.success():Result.error();
    }

}
