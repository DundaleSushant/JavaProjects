package com.GirlsHostel.service;

import com.GirlsHostel.entity.ContactDetails;
import com.GirlsHostel.jpaRepository.ContactDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactDetailsService {
    @Autowired
    private ContactDetailsRepository contactDetailsRepository;
    //get all contact details
    public List<ContactDetails>getAllContactDetails(){
        return contactDetailsRepository.findAll();
    }
    //get contact details by id

    public ContactDetails getContactDetailsById(Long id) {
        return contactDetailsRepository.findById(id).orElse(null);
    }
    //create or update contact details
    public ContactDetails saveContactDetails(ContactDetails contactDetails) {
        return contactDetailsRepository.save(contactDetails);
    }
    //delete contact details
    public void deleteContactDetails(Long id){
        contactDetailsRepository.deleteById(id);
    }
}
