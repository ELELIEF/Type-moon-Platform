package elelief.typemoon.pojo;

public class Admin {
    private Integer admId;
    private String admName;
    private String admPassword;
    private Integer admLevel;

    public Admin(Integer admId, String admName, String admPassword, Integer admLevel) {
        this.admId = admId;
        this.admName = admName;
        this.admPassword = admPassword;
        this.admLevel = admLevel;
    }

    public Admin() {
    }

    public Integer getAdmId() {
        return admId;

    }

    public void setAdmId(Integer admId) {
        this.admId = admId;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
    }

    public String getAdmPassword() {
        return admPassword;
    }

    public void setAdmPassword(String admPassword) {
        this.admPassword = admPassword;
    }

    public Integer getAdmLevel() {
        return admLevel;
    }

    public void setAdmLevel(Integer admLevel) {
        this.admLevel = admLevel;
    }
}
