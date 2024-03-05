package com.noah.sarknext2.noah.sarknext2.controllers;

import com.noah.sarknext2.noah.sarknext2.domain.User;
import com.noah.sarknext2.noah.sarknext2.services.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    public static String  uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/userImages";
    @Autowired
    public UserSer userSer;

        @GetMapping("/registration-form")
        public String registerNewUser(Model trans){
            User newUser = new User();
            trans.addAttribute("newUser", newUser);
            return "registration";
        }

        @PostMapping("/user/register")
        public String showUserRegistrationPage(User user) {
            userSer.saveUser(user);
            return "redirect:/registration-form?success";
        }

}
