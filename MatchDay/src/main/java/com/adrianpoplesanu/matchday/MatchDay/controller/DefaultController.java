package com.adrianpoplesanu.matchday.MatchDay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@CrossOrigin(origins = {"https://adrianus.ro", "https://aaa"})
public class DefaultController {
    @GetMapping("/status")
    @ResponseBody
    public String test() {
        return "Status: 200 OK<form action=\"/logout\" method=\"POST\"><button type=\"submit\" value=\"logout\">logout</button></form>";
    }

    /*@GetMapping("/")
    @ResponseBody
    public String index() {
        return "Status: 200 OK";
    }*/

    /*@GetMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }*/
}
