package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProcesoCatalogoId implements Serializable {

	@Column(name = "id_catalogo", nullable = false)
	private Integer idCatalogo;

	@Column(name = "process_id", nullable = false)
	private Integer processId;

	public ProcesoCatalogoId() {
	}

	public ProcesoCatalogoId(Integer idCatalogo, Integer processId) {
		this.idCatalogo = idCatalogo;
		this.processId = processId;
	}

	public Integer getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(Integer idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ProcesoCatalogoId that)) {
			return false;
		}
		return Objects.equals(idCatalogo, that.idCatalogo) && Objects.equals(processId, that.processId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCatalogo, processId);
	}
}