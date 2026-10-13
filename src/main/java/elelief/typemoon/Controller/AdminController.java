package elelief.typemoon.Controller;

import elelief.typemoon.Service.AdminService;
import elelief.typemoon.pojo.Admin;
import elelief.typemoon.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {
    @Autowired
    private AdminService adminService;


    @CrossOrigin(origins = "*")
    @ResponseBody


    @DeleteMapping("{adminName}")
    public Result deleteAdmin(@PathVariable String adminName) {
        int r = adminService.deleteAdmin(adminName);
        return r > 0 ? Result.success() : Result.error();

    }
}
