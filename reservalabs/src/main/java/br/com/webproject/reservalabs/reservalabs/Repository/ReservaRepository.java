package br.com.webproject.reservalabs.reservalabs.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.webproject.reservalabs.reservalabs.Model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
	
	

}
