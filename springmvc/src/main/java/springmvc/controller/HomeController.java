package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		//use Model object directly as functional parameters
		
		model.addAttribute("name", "NAKUL MATHUR");
		model.addAttribute("id",1504);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Anshul");
		
		friends.add("Karan");
		friends.add("Satyam");
		
		model.addAttribute("f",friends);
		
		System.out.println("This is home url.");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is About Controller.");
		return "about";
	}
	
	@RequestMapping("/services")
	public String services() {
		System.out.println("This is Services Controller.");
		return "services";
	}
	
	@RequestMapping("/help")
	public ModelAndView  help() {
		System.out.println("This is Help Controller.");
		
		//creating ModelandView object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting data in modelAndView object
		modelAndView.addObject("name", "NAKUL");
		modelAndView.addObject("id", 15487);
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(1445);
		list.add(558);
		list.add(258);
		list.add(15040);
		modelAndView.addObject("marks",list);
		
		
		//setting view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
