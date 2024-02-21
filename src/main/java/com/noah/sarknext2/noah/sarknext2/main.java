package com.noah.sarknext2.noah.sarknext2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class main {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
