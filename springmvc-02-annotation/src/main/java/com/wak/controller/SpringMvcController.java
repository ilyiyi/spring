package com.wak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wak
 */
@Controller
public class SpringMvcController {
    @RequestMapping("/get")
    public void getSpring() {
        System.out.println("======");
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(String username, String password) {
        return "username:" + username + ",password:" + password;
    }

    @RequestMapping(value = "/post/login", method = RequestMethod.POST)
    public String postLogin(String username, String password) {
        return "username:" + username + ",password:" + password;
    }
}
