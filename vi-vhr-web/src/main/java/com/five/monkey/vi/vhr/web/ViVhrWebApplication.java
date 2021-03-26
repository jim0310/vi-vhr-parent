package com.five.monkey.vi.vhr.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.five.monkey.vi.vhr"})
public class ViVhrWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViVhrWebApplication.class, args);
	}

}
