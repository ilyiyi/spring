package com.wak.controller;

import com.wak.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @author wak
 */
@Controller
@RequestMapping("/requestParams")
public class RequestParams {
    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestParam("u") String username, @RequestParam("p") String password) {
        System.out.println("username:" + username + ",password:" + password);
        return "ok";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user(User user) {
        System.out.println("username:" + user.getAccount() + ",password:" + user.getPassword());
        return "ok";
    }

    @RequestMapping("/array")
    @ResponseBody
    public String array(String[] cities) {
        System.out.println(Arrays.toString(cities));
        return "ok";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(@RequestParam List<String> cities) {
        System.out.println(cities);
        return "ok";
    }
}
