package elelief.typemoon.Controller;

import com.netflix.discovery.converters.Auto;
import elelief.typemoon.Service.CommentService;
import elelief.typemoon.pojo.Comment;
import elelief.typemoon.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;
    @GetMapping("/replies")
    public Result getCommentReplies(int id){
        List<Comment> replies=commentService.getCommentReplies(id);
        return Result.success(replies);
    }

    @PostMapping("/submit/{parentId}")
    public Result submitComment(@RequestBody Comment comment,@PathVariable int parentId){
        Integer r=commentService.submitComment(comment,parentId);
        return r>0?Result.success():Result.success();
    }

}
