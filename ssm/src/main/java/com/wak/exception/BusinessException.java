package com.wak.exception;

import lombok.Data;

/**
 * @author wak
 */
@Data
public class BusinessException extends RuntimeException {
    private Integer code;

    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }
}
