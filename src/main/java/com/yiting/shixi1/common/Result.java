package com.yiting.shixi1.common;


//在实际项目中,我们通常需要定义一个统一的响应格式,用于向前端返回数据。这样做的好处是:
//前后端分离开发时,前端可以根据约定的格式解析和处理响应数据,而不需要关心后端的具体实现。
//无论请求成功还是失败,都可以使用同一的响应格式,便于前端统一处理。
//可以在响应中包含状态码、错误信息等额外的数据,以便前端了解请求的执行情况。
public class Result <T>{
    private Integer code;

    private String msg;

    private T data;

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(200, "请求成功", data);
    }

    public static <T> Result<T> fail(Integer code, String message) {
        return new Result<>(code, message, null);
    }
}
