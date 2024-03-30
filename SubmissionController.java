package com.spring.mvc.intermediate.validation.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.intermediate.validation.dtoClass.DtoClass;

@Controller
public class SubmissionController {

	@RequestMapping("/")
	public String submit(@ModelAttribute("Submission")DtoClass dto) {
		
		return "home-page";
	}
	
	@RequestMapping("/processing")
	public String processing(@Valid @ModelAttribute("Submission")DtoClass dto,BindingResult res) {
		if(res.hasErrors()) {
			return "home-page";
		}
		return "register-page";
	}
}