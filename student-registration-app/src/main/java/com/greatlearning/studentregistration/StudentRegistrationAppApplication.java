package com.greatlearning.studentregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentRegistrationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationAppApplication.class, args);
		
		System.out.println("Your Student Registration App runs successfully.");
	}

}
