package elelief.typemoon.Controller;

import elelief.typemoon.Service.UserService;
import elelief.typemoon.pojo.Result;
import elelief.typemoon.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping()
    public Result getUserById(int id)
    {
        User user=userService.selectUserById(id);
        return Result.success(user);
    }

}
