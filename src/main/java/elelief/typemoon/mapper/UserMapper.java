package elelief.typemoon.mapper;

import elelief.typemoon.pojo.RegisterRequest;
import elelief.typemoon.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public Integer insertUser(User user);
    public User selectUserById(Integer id);
    public User userLogin(String username, String password);
}
