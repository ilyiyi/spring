package com.wak.controller;

import com.wak.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author wak
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "ok";
    }

    @RequestMapping("/respBody")
    @ResponseBody
    public String respBody() {
        return "ok";
    }

    @RequestMapping("/userJson")
    @ResponseBody
    public User respUserJson() {
        User user = new User();
        user.setAddTime(new Date());
        user.setName("wak");
        user.setUsername("wak123");
        user.setId(1L);
        return user;
    }
}
