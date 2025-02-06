package com.GirlsHostel.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="contact_details")
public class ContactDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;
    private String alternatePhone;
    private String email;
    private String address;
    private String city;
    private String state;
    private String pincode;

    @OneToOne(mappedBy = "contactDetails")
    private Student student;


}
