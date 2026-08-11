package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "proceso_catalogo")
public class ProcesoCatalogo {

	@EmbeddedId
	private ProcesoCatalogoId id;

	@Column(name = "id_documento", nullable = false)
	private Integer idDocumento;

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "id_archivo_electronico")
	private Integer idArchivoElectronico;

	public ProcesoCatalogo() {
	}

	public ProcesoCatalogoId getId() {
		return id;
	}

	public void setId(ProcesoCatalogoId id) {
		this.id = id;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getIdArchivoElectronico() {
		return idArchivoElectronico;
	}

	public void setIdArchivoElectronico(Integer idArchivoElectronico) {
		this.idArchivoElectronico = idArchivoElectronico;
	}
}