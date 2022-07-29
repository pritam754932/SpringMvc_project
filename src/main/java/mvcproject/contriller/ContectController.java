package mvcproject.contriller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvcproject.model.User;

@Controller
public class ContectController {

	@RequestMapping("/contect")
	public String showForm() {
		return "contect";
	}
	
	
	

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String hendalForm(@ModelAttribute User user,Model model ) {
		
		//model.addAttribute("user", user);
		System.out.println(user);
		return "success";
	}
	
	/*
	 	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String hendalForm(
			@RequestParam(name="email",required = false) String userEmail,
			@RequestParam("name") String userName,
			@RequestParam("password") String userPwd,Model model) {
		
		
System.out.println(userEmail+" "+userName+" "+userPwd);


//model.addAttribute("email",userEmail);
//model.addAttribute("name",userName);
//model.addAttribute("pwd",userPwd);

User user=new User();
user.setEmail(userEmail);
user.setName(userName);
user.setPassword(userPwd);
System.out.println(user);
model.addAttribute("user", user);
		return "success";
	}
 
	 */

}
