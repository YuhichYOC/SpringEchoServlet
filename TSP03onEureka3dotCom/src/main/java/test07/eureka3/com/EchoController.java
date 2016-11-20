package test07.eureka3.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("echo")
public class EchoController {
	
	@ModelAttribute
	public EchoForm setUpEchoForm() {
		EchoForm form = new EchoForm();
		return form;
	}
	
	@RequestMapping
	public String index(Model model) {
		return "echo/index";
	}
	
	@RequestMapping("hello")
	public String hello(EchoForm form, Model model) {
		if (form.getName().equals("test")) {
			model.addAttribute("name", form.getName());
			return "echo/index";
		} else {
			model.addAttribute("name", form.getName());
			return "echo/hello";
		}
	}
	
}
