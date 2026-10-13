package elelief.typemoon.Controller;

import elelief.typemoon.Service.AdminService;
import elelief.typemoon.Service.UserService;
import elelief.typemoon.pojo.RegisterRequest;
import elelief.typemoon.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class RegisterController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "*")
    @ResponseBody


    @PostMapping("/admin")
    public Result registerAdmin(@RequestBody RegisterRequest register) {
        Integer i = adminService.insertAdmin(register);
        return i > 0 ? Result.success() : Result.error("用户名已存在");
    }

    @PostMapping("/user")
    public Result registerUser(@RequestBody RegisterRequest register) {
        Integer i= userService.insertUser(register);
        return i>0?Result.success():Result.error();
    }

}
