package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "documento_comun_actividad")
public class DocumentoComunActividad {

	@EmbeddedId
	private DocumentoComunActividadId id;

	@Column(name = "tiene_metadatos_transferidos", length = 10)
	private String tieneMetadatosTransferidos;

	public DocumentoComunActividad() {
	}

	public DocumentoComunActividadId getId() {
		return id;
	}

	public void setId(DocumentoComunActividadId id) {
		this.id = id;
	}

	public String getTieneMetadatosTransferidos() {
		return tieneMetadatosTransferidos;
	}

	public void setTieneMetadatosTransferidos(String tieneMetadatosTransferidos) {
		this.tieneMetadatosTransferidos = tieneMetadatosTransferidos;
	}
}
