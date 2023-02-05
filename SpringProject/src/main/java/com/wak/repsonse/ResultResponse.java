package com.wak.repsonse;

import lombok.Data;

/**
 * @author wak
 */
@Data
public class ResultResponse {
    private String code;
    private String message;
    private Object data;

    public ResultResponse() {
        this.code = "0";
        this.message = "success";
    }

    public ResultResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultResponse(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultResponse put(Object data) {
        this.data = data;
        return this;
    }
}
