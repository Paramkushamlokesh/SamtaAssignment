package com.samla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.samla.service.GeneralService;

@SpringBootApplication
public class SamlaAssignmentApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SamlaAssignmentApplication.class, args);
	}

}
