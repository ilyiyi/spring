package com.wak.controller;

import com.wak.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author wak
 */
@Controller
@RequestMapping("/date")
public class DateController {
    @RequestMapping("/test")
    @ResponseBody
    public String testDate(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        System.out.println(date);
        return "OK";
    }

    @RequestMapping("/user/date")
    @ResponseBody
    public String testDate(@RequestBody User user) {
        System.out.println(user.getDate());
        System.out.println(user);
        return "OK";
    }
}
