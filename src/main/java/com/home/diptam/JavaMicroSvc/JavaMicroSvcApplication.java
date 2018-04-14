package com.home.diptam.JavaMicroSvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(value = "com.home.diptam")
public class JavaMicroSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMicroSvcApplication.class, args);
	}
}
