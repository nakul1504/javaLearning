package springmvcsearch.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		System.out.println(userId);
		System.out.println(userName);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		//processing area
		return "home";
	}
	
	@RequestMapping("/firesearch")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		RedirectView redirectView = new RedirectView();
		
		//check if the query is blank
		if(query.isBlank()) {
			redirectView.setUrl("home");
			return redirectView;
		}
		
		String url = "https://www.google.com/search?q=" + query;
		redirectView.setUrl(url);
		
		return redirectView;
	}
	
	//Handling Exceptions in our spring mvc
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NullPointerException.class)
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg","Null Format Exception has occurred");
//		return "null_page";
//	}
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String exceptionHandlerNumberFormat(Model m) {
//		m.addAttribute("msg","Number Format Exception has occurred");
//		return "null_page";
//	}
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = Exception.class)
//	public String exceptionHandlerGeneric(Model m) {
//		m.addAttribute("msg","Exception has occurred");
//		return "null_page";
//	}

}
