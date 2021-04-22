package br.com.webproject.reservalabs.reservalabs.Controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Maria José");
		return "hello";
	}	

}
