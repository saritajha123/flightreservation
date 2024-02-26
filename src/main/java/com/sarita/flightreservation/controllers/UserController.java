package com.sarita.flightreservation.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sarita.flightreservation.entities.User;
import com.sarita.flightreservation.repos.UserRepository;
import com.sarita.flightreservation.services.SecurityService;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;
//    @Autowired
	private SecurityService securityService;
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
//    @Autowired
//	private BCryptPasswordEncoder encoder;
    
	
	
	
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		LOGGER.info("Inside showRegistrationPage()");
		return "login/registerUser";

	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		LOGGER.info("Inside register()"+user);
//		user.setPassword(encoder.encode(user.getPassword()));
		user.setPassword(user.getPassword());
		userRepository.save(user);
		return "login/login";
	}

	@RequestMapping("/showLogin")
	public String showLoginPage() {
		LOGGER.info("Inside showLoginPage()");
		return "login/login";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap ,HttpServletRequest request,HttpServletResponse response) {	
//	boolean loginResponse = securityService.login(email,password, request, response);
		LOGGER.info("Inside login() and the email is: "+email);
		
//		if (loginResponse) {
//			return "login/findsFlights";
//		} else {
//			modelMap.addAttribute("msg", "Invalid user name or password.Please try again.");
//			return "login/login";
//		}
		return "login/findsFlights";
	}
	
	
	
	
	
	
	
	
	
	

}