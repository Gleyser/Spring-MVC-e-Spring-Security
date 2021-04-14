package br.com.webproject.reservalabs.reservalabs.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
	
	private String nomeDoLab;
	private LocalDate dataDaReserva;
	private String horarioDaReserva;
	private String professorResponsavel;
	private String status;
	private String informacoesComplementares;
	
	public String getNomeDoLab() {
		return nomeDoLab;
	}
	public void setNomeDoLab(String nomeDoLab) {
		this.nomeDoLab = nomeDoLab;
	}
	
	// Alterando aqui o formato que queremos que seja retornado
	public String getDataDaReserva() {
		return dataDaReserva.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	public void setDataDaReserva(LocalDate dataDaReserva) {
		this.dataDaReserva = dataDaReserva;
	}
	public String getHorarioDaReserva() {
		return horarioDaReserva;
	}
	public void setHorarioDaReserva(String horarioDaReserva) {
		this.horarioDaReserva = horarioDaReserva;
	}
	public String getProfessorResponsavel() {
		return professorResponsavel;
	}
	public void setProfessorResponsavel(String professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatusPendente() {
		this.status = "Pendente";
	}	
	
	public void setStatusAprovado() {
		this.status = "Aprovado";
	}		
	
	public void setStatusFinalizado() {
		this.status = "Finalizado";
	}
	public String getInformacoesComplementares() {
		return informacoesComplementares;
	}
	public void setInformacoesComplementares(String informacoesComplementares) {
		this.informacoesComplementares = informacoesComplementares;
	}	

}
