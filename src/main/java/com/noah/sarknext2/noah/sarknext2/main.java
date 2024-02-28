package com.noah.sarknext2.noah.sarknext2;

import com.noah.sarknext2.noah.sarknext2.entity.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class main {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/contact")
    public String home(Model model){
        Contact contact = new Contact();
        model.addAttribute("newContact", contact);
        return "contact";
    }

    public String dashboardPage(){
        return "dashboard/index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
