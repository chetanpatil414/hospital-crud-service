package com.hospital.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HospitalCrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalCrudServiceApplication.class, args);
	}

}
