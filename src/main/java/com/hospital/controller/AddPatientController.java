package com.hospital.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.hospital.dto.ApiResponse;
import com.hospital.entity.AddPatient;
import com.hospital.service.AddPatientService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AddPatientController {

	@Autowired
	AddPatientService addPatientService;

	@PostMapping(("/addPatient"))
	public ResponseEntity<ApiResponse> addPatient(@RequestBody AddPatient addPatient) throws IOException {
		addPatientService.AddPatient(addPatient);
		ApiResponse apiResponse = ApiResponse.builder().status(true).message("Patient detail added successfully").build();
		return ResponseEntity.ok(apiResponse);
	}
}
