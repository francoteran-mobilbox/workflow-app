package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MetaDisponiblesActividadId implements Serializable {

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "doc_comun_id", nullable = false)
	private Integer docComunId;

	@Column(name = "id_documento", nullable = false)
	private Integer idDocumento;

	@Column(name = "id_metadato", nullable = false)
	private Integer idMetadato;

	@Column(name = "id_bloque", nullable = false)
	private Integer idBloque;

	public MetaDisponiblesActividadId() {
	}

	public MetaDisponiblesActividadId(Integer activityId, Integer docComunId, Integer idDocumento,
			Integer idMetadato, Integer idBloque) {
		this.activityId = activityId;
		this.docComunId = docComunId;
		this.idDocumento = idDocumento;
		this.idMetadato = idMetadato;
		this.idBloque = idBloque;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getIdMetadato() {
		return idMetadato;
	}

	public void setIdMetadato(Integer idMetadato) {
		this.idMetadato = idMetadato;
	}

	public Integer getIdBloque() {
		return idBloque;
	}

	public void setIdBloque(Integer idBloque) {
		this.idBloque = idBloque;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof MetaDisponiblesActividadId that)) {
			return false;
		}
		return Objects.equals(activityId, that.activityId)
				&& Objects.equals(docComunId, that.docComunId)
				&& Objects.equals(idDocumento, that.idDocumento)
				&& Objects.equals(idMetadato, that.idMetadato)
				&& Objects.equals(idBloque, that.idBloque);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activityId, docComunId, idDocumento, idMetadato, idBloque);
	}
}
