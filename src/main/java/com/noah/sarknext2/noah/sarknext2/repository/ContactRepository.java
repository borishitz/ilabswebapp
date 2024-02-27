package com.noah.sarknext2.noah.sarknext2.repository;


import com.noah.sarknext2.noah.sarknext2.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
