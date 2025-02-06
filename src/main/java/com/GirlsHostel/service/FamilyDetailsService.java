package com.GirlsHostel.service;

import com.GirlsHostel.entity.FamilyDetails;
import com.GirlsHostel.jpaRepository.FamilyDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyDetailsService {
    @Autowired
    private FamilyDetailsRepository familyDetailsRepository;

    //get all family details
    public List<FamilyDetails> getAllFamilyDetails() {
        return familyDetailsRepository.findAll();
    }

    //get family details by id
//    public Optional<FamilyDetails> getFamilyDetailsById(Long id) {
//        return familyDetailsRepository.findById(id);
//    }

    // create or update family details
    public FamilyDetails saveFamilyDetails(FamilyDetails familyDetails) {
        return familyDetailsRepository.save(familyDetails);
    }
    //delete family details
    public void deleteFamilyDetails(Long id){
        familyDetailsRepository.deleteById(id);
    }

    public FamilyDetails getFamilyDetailsById(Long id) {
        return familyDetailsRepository.findById(id).orElse(null);
    }
}