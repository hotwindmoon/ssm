package com.test.controller;

import com.test.pojo.User;
import com.test.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService = null;

    @RequestMapping(value = "/showUser", method = RequestMethod.GET)
    @ResponseBody
    public User showUser(@RequestParam int id, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        User user = userService.getUserById(id);
        /*ModelAndView modelAndView = new ModelAndView("query_user");
        //ModelAndView modelAndView = new ModelAndView("redirect:/query_user.jsp");
        modelAndView.addObject("user", user);*/
        return user;
    }
}
