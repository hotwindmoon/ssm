package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JumpController {

    @RequestMapping(value="/jump", produces="text/html; charset=utf-8")
    public ModelAndView getJumpPage() {
        ModelAndView modelAndView = new ModelAndView("query_user");
        return modelAndView;
    }

}
