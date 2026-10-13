package elelief.typemoon.Service;

import elelief.typemoon.pojo.LoginRequest;
import elelief.typemoon.pojo.RegisterRequest;

public interface AdminService {
    public Integer insertAdmin(RegisterRequest registerRequest);

    public LoginRequest adminLogin(LoginRequest loginRequest);

    public Integer deleteAdmin(String adminName);
}
