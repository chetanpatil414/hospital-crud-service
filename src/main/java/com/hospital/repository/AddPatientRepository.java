package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.entity.AddPatient;

@Repository
public interface AddPatientRepository extends JpaRepository<AddPatient, Integer> {

}
