package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "actividades_planificacion")
public class ActividadesPlanificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_actividades")
	private Integer idActividades;

	@Column(name = "fecha_inicio")
	private LocalDateTime fechaInicio;

	@Column(name = "fecha_termino")
	private LocalDateTime fechaTermino;

	@Column(name = "process_id")
	private Integer processId;

	@Column(name = "terminada")
	private Boolean terminada;

	@Column(name = "fecha_real_inicio")
	private LocalDateTime fechaRealInicio;

	@Column(name = "fecha_real_termino")
	private LocalDateTime fechaRealTermino;

	@Column(name = "modificando")
	private Boolean modificando;

	@Column(name = "instanciada")
	private Boolean instanciada;

	@Column(name = "aprobado")
	private Boolean aprobado;

	public ActividadesPlanificacion() {
	}

	public Integer getIdActividades() {
		return idActividades;
	}

	public void setIdActividades(Integer idActividades) {
		this.idActividades = idActividades;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(LocalDateTime fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Boolean getTerminada() {
		return terminada;
	}

	public void setTerminada(Boolean terminada) {
		this.terminada = terminada;
	}

	public LocalDateTime getFechaRealInicio() {
		return fechaRealInicio;
	}

	public void setFechaRealInicio(LocalDateTime fechaRealInicio) {
		this.fechaRealInicio = fechaRealInicio;
	}

	public LocalDateTime getFechaRealTermino() {
		return fechaRealTermino;
	}

	public void setFechaRealTermino(LocalDateTime fechaRealTermino) {
		this.fechaRealTermino = fechaRealTermino;
	}

	public Boolean getModificando() {
		return modificando;
	}

	public void setModificando(Boolean modificando) {
		this.modificando = modificando;
	}

	public Boolean getInstanciada() {
		return instanciada;
	}

	public void setInstanciada(Boolean instanciada) {
		this.instanciada = instanciada;
	}

	public Boolean getAprobado() {
		return aprobado;
	}

	public void setAprobado(Boolean aprobado) {
		this.aprobado = aprobado;
	}
}