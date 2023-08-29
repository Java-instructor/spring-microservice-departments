package com.sasi.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = { ErrorMvcAutoConfiguration.class })
public class DepartmentMain {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentMain.class, args);
	}

}
