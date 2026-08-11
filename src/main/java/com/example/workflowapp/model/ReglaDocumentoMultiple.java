package com.example.workflowapp.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "regla_documento_multiple")
public class ReglaDocumentoMultiple {

	@EmbeddedId
	private ReglaDocumentoMultipleId id;

	public ReglaDocumentoMultiple() {
	}

	public ReglaDocumentoMultipleId getId() {
		return id;
	}

	public void setId(ReglaDocumentoMultipleId id) {
		this.id = id;
	}
}
