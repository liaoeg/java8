package com.leg.test.controller;


import com.leg.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 廖恩光
 * @since 2021-01-22
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("queryAll")
    public String queryAll(Model model) {
        model.addAttribute("userList", userService.query());
        return "test";
    }


}

