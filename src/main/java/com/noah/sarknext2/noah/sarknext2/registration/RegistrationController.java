package com.noah.sarknext2.noah.sarknext2.registration;

import com.noah.sarknext2.noah.sarknext2.entity.User;
import com.noah.sarknext2.noah.sarknext2.event.RegistrationCompleteEvent;
import com.noah.sarknext2.noah.sarknext2.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class RegistrationController {
    private final IUserService userService;
    private final ApplicationEventPublisher publisher;

    @GetMapping("/registration-form")
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new RegistrationRequest());
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") RegistrationRequest registration){
        User user = userService.registerUser(registration);
        // Public verification email
        publisher.publishEvent(new RegistrationCompleteEvent(user, ""));
        return "redirect:/registration-form?success";
    }

}
