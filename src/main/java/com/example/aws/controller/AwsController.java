package com.example.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

	@GetMapping("/hi")
	public void show()
	{
		System.out.println("Aws Assignment executed!");
	}
}
