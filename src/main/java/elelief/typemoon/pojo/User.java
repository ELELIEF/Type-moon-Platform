package elelief.typemoon.pojo;

import java.util.Date;

public class User {
    private Integer userId;
    private String userName;
    private Integer userAge;
    private String userPassword;
    private Date userRegtime;
    private String userUid;
    private int userSex;

    public User(Integer userId, String userName, Integer userAge, String userPassword, Date userRegtime, String userUid) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.userPassword = userPassword;
        this.userRegtime = userRegtime;
        this.userUid = userUid;
    }

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getUserRegtime() {
        return userRegtime;
    }

    public void setUserRegtime(Date userRegtime) {
        this.userRegtime = userRegtime;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }
}
