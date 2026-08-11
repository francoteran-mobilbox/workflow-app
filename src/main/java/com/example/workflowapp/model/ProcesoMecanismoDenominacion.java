package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proceso_mecanismo_denominacion")
public class ProcesoMecanismoDenominacion {

	@Id
	@Column(name = "process_id")
	private Integer processId;

	@Column(name = "id_mecanismo_denominacion", nullable = false)
	private Integer idMecanismoDenominacion;

	public ProcesoMecanismoDenominacion() {
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Integer getIdMecanismoDenominacion() {
		return idMecanismoDenominacion;
	}

	public void setIdMecanismoDenominacion(Integer idMecanismoDenominacion) {
		this.idMecanismoDenominacion = idMecanismoDenominacion;
	}
}
