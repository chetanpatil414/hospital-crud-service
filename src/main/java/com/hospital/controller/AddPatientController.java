package com.hospital.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.dto.ApiResponse;
import com.hospital.entity.AddPatient;
import com.hospital.service.AddPatientService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AddPatientController {

	@Autowired
	AddPatientService addPatientService;

	@RequestMapping(value = ("/addPatient") , method = RequestMethod.POST)
	public ResponseEntity<ApiResponse> addPatient(@RequestBody AddPatient addPatient) throws IOException {
		addPatientService.AddPatient(addPatient);
		ApiResponse apiResponse = ApiResponse.builder().status(true).message("Patient detail added successfully").build();
		return ResponseEntity.ok(apiResponse);
	}
}
