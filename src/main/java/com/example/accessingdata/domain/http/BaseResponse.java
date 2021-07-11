package com.example.accessingdata.domain.http;

public class BaseResponse<T> {
    private String code;
    private String message;
    private T data;

    public BaseResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static BaseResponse<?> successWithNoData() {
        return new BaseResponse<>("200", "API OK", null);
    }

    public static <T> BaseResponse<T> successWithData(T data) {
        return new BaseResponse<>("200", "API OK", data);
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
