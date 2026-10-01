package com.example.workflowapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "regla_documento_multiple")
public class ReglaDocumentoMultiple {

	@EmbeddedId
	private ReglaDocumentoMultipleId id;

	@JsonIgnore
	@Transient
	private String nombreDocComunRegla;

	public ReglaDocumentoMultiple() {
	}

	public ReglaDocumentoMultipleId getId() {
		return id;
	}

	public void setId(ReglaDocumentoMultipleId id) {
		this.id = id;
	}

	public String getNombreDocComunRegla() {
		return nombreDocComunRegla;
	}

	public void setNombreDocComunRegla(String nombreDocComunRegla) {
		this.nombreDocComunRegla = nombreDocComunRegla;
	}
}
