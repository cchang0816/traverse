package com.traverse.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class signUpController {

	@GetMapping("/member/signUp")
	public void signUp() {}
}
