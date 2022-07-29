



package mvcproject.contriller;




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
	public String home() {
		System.out.println("home page calling");
		return "index";
	}
	@RequestMapping("/pk")
	public String pk(Model model) {
		System.out.println("pritam page calling");
		model.addAttribute("name","pritam kumar singh");
		model.addAttribute("id", 12345);
		
	List<String> f=new  ArrayList<String>();
		f.add("priya singh");
		f.add("santosh kumar");
		f.add("raja ku");
		model.addAttribute("list", f);
		
		return "pritam";
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView model=new ModelAndView();
		
		model.addObject("name","pritam sing");
		
		LocalDateTime t=LocalDateTime.now();
		model.addObject("now", t);
		
		List<String> f=new  ArrayList<String>();
		f.add("priya singh");
		f.add("santosh kumar");
		f.add("raja ku");
		model.addObject("mark", f);
		model.setViewName("help");
		return model;
	}

}
