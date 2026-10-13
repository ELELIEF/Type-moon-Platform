package elelief.typemoon.Service.impl;

import elelief.typemoon.Service.UserService;
import elelief.typemoon.mapper.UserMapper;
import elelief.typemoon.pojo.LoginRequest;
import elelief.typemoon.pojo.RegisterRequest;
import elelief.typemoon.pojo.Result;
import elelief.typemoon.pojo.User;
import elelief.typemoon.utils.Jwtutil;
import elelief.typemoon.utils.Uidutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    private static final Instant now=ZonedDateTime.now(ZoneId.of("Asia/Shanghai")).toInstant();
    public Integer insertUser(RegisterRequest registerRequest) {
        if(registerRequest!=null) {
            User user = new User();
            user.setUserName(registerRequest.getRegisterUsername());
            user.setUserPassword(registerRequest.getRegisterPassword());
            user.setUserAge(20);
            user.setUserSex(3);
            user.setUserRegtime(Date.from(now));
            user.setUserUid(Uidutil.generateOrderedUid(LocalDateTime.ofInstant(now, ZoneId.of("Asia/Shanghai"))));

        Integer r = userMapper.insertUser(user);
        return r;
        }
        else{
            return 0;
        }
    }
    public User selectUserById(Integer id) {
        User user=userMapper.selectUserById(id);
        return user;
    }
    public LoginRequest userLogin(LoginRequest loginRequest) {
        User user=userMapper.userLogin(loginRequest.getUsername(),loginRequest.getPassword());
        if(user!=null) {
            loginRequest.setUserid(user.getUserId());
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", user.getUserId());
            map.put("username", user.getUserName());
            loginRequest.setToken(Jwtutil.generateToken(map));
        }
        return loginRequest;
        }

}
