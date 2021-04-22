package br.com.webproject.reservalabs.reservalabs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.webproject.reservalabs.reservalabs.Model.Reserva;
import br.com.webproject.reservalabs.reservalabs.Repository.ReservaRepository;

@Controller
public class ReservaController {
	
	@Autowired
	private ReservaRepository reservaRepository;
	
	@GetMapping("/reservas")
	public String home(Model model) {
		
		List<Reserva> reservas = this.reservaRepository.findAll();
		model.addAttribute("reservas", reservas);
		return "reservas";
	}

}
