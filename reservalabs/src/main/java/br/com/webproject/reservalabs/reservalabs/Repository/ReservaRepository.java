package br.com.webproject.reservalabs.reservalabs.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.webproject.reservalabs.reservalabs.Model.Reserva;

@Repository
public class ReservaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Reserva> retornaReservas(){
		Query query = entityManager.createQuery("select r from Reserva r", Reserva.class);
		List<Reserva> reservas = query.getResultList();
		return reservas;
	}

}
