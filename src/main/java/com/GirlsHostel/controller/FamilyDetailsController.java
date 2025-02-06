package com.GirlsHostel.controller;

import com.GirlsHostel.entity.ContactDetails;
import com.GirlsHostel.entity.FamilyDetails;
import com.GirlsHostel.service.ContactDetailsService;
import com.GirlsHostel.service.FamilyDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/family_details")
public class FamilyDetailsController {
    @Autowired
    private FamilyDetailsService familyDetailsService;
    // get all family details
    @GetMapping
    public List<FamilyDetails> getAllFamilyDetails(){
        return familyDetailsService.getAllFamilyDetails();
    }
    // get contact details by id
    @GetMapping("/{id}")
    public ResponseEntity<FamilyDetails> getFamilyDetailsById(@PathVariable Long id){
        FamilyDetails familyDetails=familyDetailsService.getFamilyDetailsById(id);
        return familyDetails != null ? ResponseEntity.ok(familyDetails):ResponseEntity.notFound().build();
    }
    //create or update contact Details
    @PostMapping("/save")
    public ResponseEntity<FamilyDetails>createOrUpdateFamilyDetails(@Validated @RequestBody FamilyDetails familyDetails){
        return ResponseEntity.ok(familyDetailsService.saveFamilyDetails(familyDetails));
    }
    //delete contacts by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteFamilyDetails(@PathVariable Long id){
        familyDetailsService.deleteFamilyDetails(id);
        return ResponseEntity.noContent().build();
    }
}
