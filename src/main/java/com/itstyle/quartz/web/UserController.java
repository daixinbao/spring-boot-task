package com.itstyle.quartz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daixn on 2020/5/16 18:08
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("regsite")
    public String regsite() {
        return "regsite";
    }
    @RequestMapping("login")
    public String login() {
        return "login";
    }
}
