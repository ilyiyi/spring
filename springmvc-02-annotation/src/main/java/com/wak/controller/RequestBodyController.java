package com.wak.controller;

import com.wak.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wak
 */
@Controller
@RequestMapping("/requestBodyController")
public class RequestBodyController {
    @RequestMapping("/user/save")
    @ResponseBody
    public String saveUser(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/user/list")
    @ResponseBody
    public String saveUser(@RequestBody List<String>list) {
        System.out.println(list);
        return "ok";
    }
}
