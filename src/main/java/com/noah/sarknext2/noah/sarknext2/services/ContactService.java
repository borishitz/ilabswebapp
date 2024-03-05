package com.noah.sarknext2.noah.sarknext2.services;


import com.noah.sarknext2.noah.sarknext2.domain.Contact;
import com.noah.sarknext2.noah.sarknext2.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public List<Contact> allContacts(){
        return (List<Contact>) contactRepository.findAll();
    }
}
