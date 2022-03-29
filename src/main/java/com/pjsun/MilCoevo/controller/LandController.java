package com.pjsun.MilCoevo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class LandController {

    @GetMapping("/")
    public String adminPage() {

        return "index";
    }
}
