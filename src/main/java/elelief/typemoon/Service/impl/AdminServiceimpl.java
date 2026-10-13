package elelief.typemoon.Service.impl;

import elelief.typemoon.Service.AdminService;
import elelief.typemoon.mapper.AdminMapper;
import elelief.typemoon.pojo.Admin;
import elelief.typemoon.pojo.LoginRequest;
import elelief.typemoon.pojo.RegisterRequest;
import elelief.typemoon.utils.Jwtutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AdminServiceimpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Integer insertAdmin(RegisterRequest registerRequest) {
        if (adminMapper.adminExist(registerRequest.getRegisterUsername()) == 0) {
            Admin admin = new Admin();
            admin.setAdmLevel(1);
            admin.setAdmName(registerRequest.getRegisterUsername());
            admin.setAdmPassword(registerRequest.getRegisterPassword());
            Integer r = adminMapper.insertAdmin(admin);
            return r;
        } else
            return 0;
    }

    public LoginRequest adminLogin(LoginRequest login) {
        Admin admin = adminMapper.selectAdminLogin(login.getUsername(), login.getPassword());
        if (admin != null) {
            login.setUserid(admin.getAdmId());
            Map<String, Object> map = new HashMap<>();
            map.put("id", admin.getAdmId());
            map.put("username", login.getUsername());
            login.setToken(Jwtutil.generateToken(map));
        }
        return login;
    }

    public Integer deleteAdmin(String adminName) {
        Integer r = adminMapper.deleteAdmin(adminName);
        return r;
    }


}
