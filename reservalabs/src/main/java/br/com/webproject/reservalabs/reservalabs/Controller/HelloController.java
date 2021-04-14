package br.com.webproject.reservalabs.reservalabs.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

import br.com.webproject.reservalabs.reservalabs.Model.Reserva;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Maria José");
		return "hello";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		Reserva reserva = new Reserva();
		reserva.setNomeDoLab("Lab TI - 07");
		reserva.setDataDaReserva(LocalDate.parse("26/03/2019", DateTimeFormatter.ofPattern("dd/MM/uuuu")));
		reserva.setHorarioDaReserva("07:00 - 11:00");
		reserva.setProfessorResponsavel("Augusto");
		reserva.setStatusPendente();
		reserva.setInformacoesComplementares("Aula do emprega mais");
		List<Reserva> reservas = Arrays.asList(reserva);
		
		model.addAttribute("reservas", reservas);
		return "home";
	}

}
