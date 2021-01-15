package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute()
	public void commontoAllForms(Model m) {
		m.addAttribute("Header","NK Registration Form");
		m.addAttribute("Desc","Register with security");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
				
		}
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id " + createUser);
		return "success";
	}

}
