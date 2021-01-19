package com.practice.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class MyController {

	// handler for about page
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {

		System.out.println("Inside about handler");
		model.addAttribute("name", "Nakul Mathur");
		model.addAttribute("currentDate", new Date().toLocaleString());
		return "about";
		// about.html
	}

	// handler for iterator page
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {

		// creating any coolection i.e. iterable such as array, list etc. and maps too
		List<String> names = List.of("Ankit", "Karan", "Nakul", "Satyam");
		model.addAttribute("names", names);

		System.out.println("Inside iterate handler");
		return "iterate";
	}

	// handler for conditional page
	@GetMapping("/condition")
	public String conditionalHandler(Model model) {
		System.out.println("Inside conditional handler");
		model.addAttribute("isActive", false);
		model.addAttribute("gender", "F");

		List<Integer> numbers = List.of(1504);
		model.addAttribute("numbers", numbers);
		return "condition";
	}

	// handler for handling fragments
	@GetMapping("/services")
	public String servicesHandler(Model model) {
		model.addAttribute("title", "Nex Techno. Ltd.");
		model.addAttribute("subtitle", LocalDate.now().toString());
		System.out.println("Inside services handler");
		return "services";
	}

	// for new about
	@GetMapping("/newabout")
	public String newAbout(Model model) {
		return "aboutnew";
	}

	// for new about
	@GetMapping("/contact")
	public String contact(Model model) {
		return "contact";
	}

}
