package kr.co.rocketkurly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class MemberController {

	@RequestMapping(value = "login.do", method = GET)
	public String loginPage() {
		
		return "login";
		
	}// loginPage
	
}// class