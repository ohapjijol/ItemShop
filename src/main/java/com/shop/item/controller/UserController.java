package com.shop.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.user.model.User;
import com.shop.user.service.UserService;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "/isRightUser", method = RequestMethod.POST)
    @ResponseBody
    public boolean isRightUser(@RequestBody User user) {
        return checkRightUser(user);
    }

    private boolean checkRightUser(User user) {
        if (StringUtils.isEmpty(user.getUserId()) || StringUtils.isEmpty(user.getUserPwd())) {
            return false;
        } else {
            String inputPwd = user.getUserPwd();
            String rightPwd = userService.getUser(user.getUserId()).getUserPwd();
            return inputPwd.equals(rightPwd);
        }
    }
}
