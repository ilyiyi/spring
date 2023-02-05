package com.wak.exception;

import com.wak.resp.ResultResp;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author wak
 */
@RestControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler(BusinessException.class)
    public ResultResp handleException(BusinessException e) {
        return new ResultResp(e.getCode(), null, e.getMessage());
    }
}
