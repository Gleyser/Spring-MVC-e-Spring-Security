package br.com.webproject.reservalabs.reservalabs.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

import br.com.webproject.reservalabs.reservalabs.Model.Reserva;

@Controller
public class HelloController {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Maria José");
		return "hello";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		Query query = entityManager.createQuery("select r from Reserva r", Reserva.class);
		List<Reserva> reservas = query.getResultList();
				
		model.addAttribute("reservas", reservas);
		return "home";
	}

}
