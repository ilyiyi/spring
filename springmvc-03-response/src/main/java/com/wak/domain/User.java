package com.wak.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author wak
 */
@Data
public class User {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date addTime;
    private String username;
    private Long id;
}
