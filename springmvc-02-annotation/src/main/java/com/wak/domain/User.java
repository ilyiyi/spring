package com.wak.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author wak
 */
@Data
public class User {
    private String account;
    private String password;
    private Address address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
}
