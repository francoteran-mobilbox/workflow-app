package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "plan_proceso")
public class PlanProceso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_plan_proceso")
	private Integer idPlanProceso;

	@Column(name = "process_id")
	private Integer processId;

	@Column(name = "nombre_plan")
	private String nombrePlan;

	@Column(name = "fecha_inicio")
	private LocalDate fechaInicio;

	@Column(name = "fecha_termino")
	private LocalDate fechaTermino;

	public PlanProceso() {
	}

	public Integer getIdPlanProceso() {
		return idPlanProceso;
	}

	public void setIdPlanProceso(Integer idPlanProceso) {
		this.idPlanProceso = idPlanProceso;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public String getNombrePlan() {
		return nombrePlan;
	}

	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(LocalDate fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
}