package elelief.typemoon.Service;

import elelief.typemoon.pojo.LoginRequest;
import elelief.typemoon.pojo.RegisterRequest;
import elelief.typemoon.pojo.User;

public interface UserService {
    public Integer insertUser(RegisterRequest registerRequest);
    public User selectUserById(Integer userId);
    public LoginRequest userLogin(LoginRequest loginRequest);
}
