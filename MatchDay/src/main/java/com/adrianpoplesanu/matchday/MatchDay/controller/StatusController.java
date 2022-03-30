package com.adrianpoplesanu.matchday.MatchDay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatusController {
    @GetMapping("/status")
    @ResponseBody
    public String test() {
        return "aaa";
    }
}
