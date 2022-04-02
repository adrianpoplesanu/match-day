package com.adrianpoplesanu.matchday.MatchDay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    @GetMapping("/status")
    @ResponseBody
    public String test() {
        return "Status: 200 OK";
    }

    /*@GetMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }*/
}
