package elelief.typemoon.pojo;

public class RegisterRequest {
    private String registerUsername;
    private String registerPassword;

    public String getRegisterUsername() {
        return registerUsername;
    }

    public void setRegisterUsername(String registerUsername) {
        this.registerUsername = registerUsername;
    }

    public String getRegisterPassword() {
        return registerPassword;
    }

    public void setRegisterPassword(String registerPassword) {
        this.registerPassword = registerPassword;
    }

    public RegisterRequest(String registerUsername, String registerPassword) {
        this.registerUsername = registerUsername;
        this.registerPassword = registerPassword;
    }
    public RegisterRequest() {}
}
