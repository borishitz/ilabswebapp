package com.noah.sarknext2.noah.sarknext2.controllers;

import com.noah.sarknext2.noah.sarknext2.domain.Contact;
import com.noah.sarknext2.noah.sarknext2.repository.ContactRepository;
import com.noah.sarknext2.noah.sarknext2.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/dashboard")
    public String homePage(Model model){
        List<Contact> contacts = contactService.allContacts();
        model.addAttribute("allContacts", contacts);
        return "dashboard/index";
    }

    @GetMapping("/contact/add")
    public String addContact(Model model){
        Contact contact = new Contact();
        model.addAttribute("newContact", contact);
        return "about";
    }

    @GetMapping("/contacts")
    public String getAllContacts(Model model){
        List<Contact> contacts = contactService.allContacts();
        model.addAttribute("contacts", contacts);
        return "FormList";
    }

    @PostMapping("/contact/save")
    public String saveContact(Contact contact){
        contactService.saveContact(contact);
        return "redirect:/";
    }
}
