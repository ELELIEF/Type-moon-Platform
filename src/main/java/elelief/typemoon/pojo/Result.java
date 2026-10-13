package elelief.typemoon.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result success() {
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        result.data = data;
        return result;
    }

    public static Result success(LoginRequest loginRequest) {
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        result.data = loginRequest;
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("error");
        return result;
    }



    public static Result success(String url) {
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        result.data = url;
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg(msg);
        return result;
    }

    public static Result success(CompositionMessage compositionMessage) {
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        result.data = compositionMessage;
        return result;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
    public Object getData() {
        return data;
    }
}
