package com.hospital.service.impl;

import com.hospital.service.AddPatientService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.AddPatient;
import com.hospital.repository.AddPatientRepository;

@Service
public class AddPatientServiceImpl implements AddPatientService {
	
	@Autowired
	AddPatientRepository addPatientRepository;

	@Override
	public void AddPatient(AddPatient addPatient) throws IOException {
		addPatientRepository.save(addPatient);
		
	}

}
