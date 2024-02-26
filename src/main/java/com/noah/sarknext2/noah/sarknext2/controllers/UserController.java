package com.noah.sarknext2.noah.sarknext2.controllers;

import com.noah.sarknext2.noah.sarknext2.entity.User;
import com.noah.sarknext2.noah.sarknext2.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final IUserService iUserService;

    @GetMapping
    public String allUsers(Model model){
        List<User> users = iUserService.getAllUsers();
        model.addAttribute("allUsers", users);
        return "index";
    }
}
