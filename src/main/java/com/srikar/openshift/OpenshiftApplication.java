package com.srikar.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}


	@GetMapping("/")
	public String welcome() {
		return "Welcome to Red Hat OpenShift World..";
	}

	@GetMapping("/{input}")
	public String welcomeString(@PathVariable String input) {
		return ".." + input + " Your app deployed into OCP..";
	}


} //End of OpenShiftApplication Class
