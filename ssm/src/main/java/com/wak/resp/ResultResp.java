package com.wak.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wak
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultResp {
    private Integer code;
    private Object data;
    private String msg;

    public ResultResp(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public static ResultResp success(Integer code, Object data) {
        return new ResultResp(code, data);
    }
}
