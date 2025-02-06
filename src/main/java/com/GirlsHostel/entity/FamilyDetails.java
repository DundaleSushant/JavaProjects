package com.GirlsHostel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name= "family_details")
public class FamilyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fatherName;
    private String MotherName;
    private String permanentAddress;
    private  String parentPhone;

    @ManyToOne
    @JoinColumn(name= "student_id",nullable = false)
    private Student student;


}
