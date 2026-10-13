package elelief.typemoon.mapper;

import elelief.typemoon.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {
    Integer insertAdmin(Admin admin);

    Admin selectAdminLogin(@Param("username") String username, @Param("password") String password);

    Integer deleteAdmin(String adminName);

    Integer adminExist(@Param("adminName") String adminName);
}
