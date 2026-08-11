package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transitions")
public class Transition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transition_id")
	private Integer transitionId;

	@Column(name = "transition_name")
	private String transitionName;

	@Column(name = "activity_id_source")
	private Integer activityIdSource;

	@Column(name = "activity_id_destination")
	private Integer activityIdDestination;

	@Column(name = "process_id")
	private Integer processId;

	@Column(name = "transitiontype_id")
	private String transitiontypeId;

	@Column(name = "id_accion_transicion")
	private String idAccionTransicion;

	@Column(name = "tiene_timer")
	private Boolean tieneTimer;

	@Column(name = "levanta_form")
	private Boolean levantaForm;

	public Transition() {
	}

	public Integer getTransitionId() {
		return transitionId;
	}

	public void setTransitionId(Integer transitionId) {
		this.transitionId = transitionId;
	}

	public String getTransitionName() {
		return transitionName;
	}

	public void setTransitionName(String transitionName) {
		this.transitionName = transitionName;
	}

	public Integer getActivityIdSource() {
		return activityIdSource;
	}

	public void setActivityIdSource(Integer activityIdSource) {
		this.activityIdSource = activityIdSource;
	}

	public Integer getActivityIdDestination() {
		return activityIdDestination;
	}

	public void setActivityIdDestination(Integer activityIdDestination) {
		this.activityIdDestination = activityIdDestination;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public String getTransitiontypeId() {
		return transitiontypeId;
	}

	public void setTransitiontypeId(String transitiontypeId) {
		this.transitiontypeId = transitiontypeId;
	}

	public String getIdAccionTransicion() {
		return idAccionTransicion;
	}

	public void setIdAccionTransicion(String idAccionTransicion) {
		this.idAccionTransicion = idAccionTransicion;
	}

	public Boolean getTieneTimer() {
		return tieneTimer;
	}

	public void setTieneTimer(Boolean tieneTimer) {
		this.tieneTimer = tieneTimer;
	}

	public Boolean getLevantaForm() {
		return levantaForm;
	}

	public void setLevantaForm(Boolean levantaForm) {
		this.levantaForm = levantaForm;
	}
}