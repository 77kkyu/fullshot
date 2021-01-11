package com.example.fullshot.result;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseMessage {

    private HttpStatus code;

    private int size;

    private String message;

    private String accessToken;

    private int totalCount;

    private Object data;


    public ResponseMessage() {}

    public static ResponseMessage successInstance() {
        return new ResponseMessage().success();
    }

    public ResponseMessage success() {
        code = HttpStatus.OK;
        message = "Success";
        return this;
    }

    public ResponseMessage fail() {
        code = HttpStatus.INTERNAL_SERVER_ERROR;
        message = "SERVER_ERROR";
        return this;
    }

    public ResponseMessage setStatusCode(HttpStatus statusCode) {
        this.code = statusCode;
        return this;
    }

    public ResponseMessage setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResponseMessage setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public ResponseMessage setData(Object data) {
        this.data = data;
        return this;
    }

    public ResponseMessage setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public int code() {
        return code.value();
    }
}
