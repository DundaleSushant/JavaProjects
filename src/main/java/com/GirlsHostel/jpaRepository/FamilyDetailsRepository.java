package com.GirlsHostel.jpaRepository;

import com.GirlsHostel.entity.FamilyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyDetailsRepository extends JpaRepository<FamilyDetails, Long> {
}
