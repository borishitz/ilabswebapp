package com.noah.sarknext2.noah.sarknext2.repository;


import com.noah.sarknext2.noah.sarknext2.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
