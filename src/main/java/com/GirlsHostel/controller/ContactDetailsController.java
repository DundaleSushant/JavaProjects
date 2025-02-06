package com.GirlsHostel.controller;

import com.GirlsHostel.entity.ContactDetails;
import com.GirlsHostel.service.ContactDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact_details")
public class ContactDetailsController {
    @Autowired
    private ContactDetailsService contactDetailsService;
    // get all contact details
    @GetMapping
    public List<ContactDetails>getAllContactDetails(){
        return contactDetailsService.getAllContactDetails();
    }
    // get contact details by id
    @GetMapping("/{id}")
    public ResponseEntity<ContactDetails>getContactDetailsById(@PathVariable Long id){
        ContactDetails contactDetails=contactDetailsService.getContactDetailsById(id);
        return contactDetails != null ? ResponseEntity.ok(contactDetails):ResponseEntity.notFound().build();
    }
    //create or update contact Details
    @PostMapping("/save")
    public ResponseEntity<ContactDetails>createOrUpdateContactDetails(@Validated @RequestBody ContactDetails contactDetails){
        return ResponseEntity.ok(contactDetailsService.saveContactDetails(contactDetails));
    }
    //delete contacts by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteContactDetails(@PathVariable Long id){
        contactDetailsService.deleteContactDetails(id);
        return ResponseEntity.noContent().build();
    }
}
