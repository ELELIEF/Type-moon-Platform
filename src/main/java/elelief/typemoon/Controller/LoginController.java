package elelief.typemoon.Controller;

import elelief.typemoon.Service.AdminService;
import elelief.typemoon.Service.UserService;
import elelief.typemoon.pojo.LoginRequest;
import elelief.typemoon.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "*")
    @ResponseBody


    @PostMapping("/admin")
    public Result loginAdmin(@RequestBody LoginRequest lr) {
        LoginRequest login = adminService.adminLogin(lr);
        return login.getToken() == null || login.getToken().isEmpty() ? Result.error() : Result.success(login);
    }

    @PostMapping("/user")
    public Result loginUser(@RequestBody LoginRequest lr) {
        LoginRequest login= userService.userLogin(lr);
        return login.getToken() == null || login.getToken().isEmpty() ? Result.error() : Result.success(login);
    }

}
