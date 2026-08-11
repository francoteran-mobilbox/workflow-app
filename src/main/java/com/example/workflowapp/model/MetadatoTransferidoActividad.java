package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "metadato_transferido_actividad")
public class MetadatoTransferidoActividad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "metadato_transferido_id")
	private Integer metadatoTransferidoId;

	@Column(name = "activity_id", nullable = false)
	private Integer activityId;

	@Column(name = "doc_comun_id_origen", nullable = false)
	private Integer docComunIdOrigen;

	@Column(name = "id_documento_origen")
	private Integer idDocumentoOrigen;

	@Column(name = "id_metadato_origen")
	private Integer idMetadatoOrigen;

	@Column(name = "id_bloque_origen")
	private Integer idBloqueOrigen;

	@Column(name = "codigo_bloque_origen")
	private String codigoBloqueOrigen;

	@Column(name = "doc_comun_id_destino", nullable = false)
	private Integer docComunIdDestino;

	@Column(name = "id_documento_destino", nullable = false)
	private Integer idDocumentoDestino;

	@Column(name = "id_metadato_destino", nullable = false)
	private Integer idMetadatoDestino;

	@Column(name = "id_bloque_destino", nullable = false)
	private Integer idBloqueDestino;

	@Column(name = "codigo_bloque_destino")
	private String codigoBloqueDestino;

	public MetadatoTransferidoActividad() {
	}

	public Integer getMetadatoTransferidoId() {
		return metadatoTransferidoId;
	}

	public void setMetadatoTransferidoId(Integer metadatoTransferidoId) {
		this.metadatoTransferidoId = metadatoTransferidoId;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getDocComunIdOrigen() {
		return docComunIdOrigen;
	}

	public void setDocComunIdOrigen(Integer docComunIdOrigen) {
		this.docComunIdOrigen = docComunIdOrigen;
	}

	public Integer getIdDocumentoOrigen() {
		return idDocumentoOrigen;
	}

	public void setIdDocumentoOrigen(Integer idDocumentoOrigen) {
		this.idDocumentoOrigen = idDocumentoOrigen;
	}

	public Integer getIdMetadatoOrigen() {
		return idMetadatoOrigen;
	}

	public void setIdMetadatoOrigen(Integer idMetadatoOrigen) {
		this.idMetadatoOrigen = idMetadatoOrigen;
	}

	public Integer getIdBloqueOrigen() {
		return idBloqueOrigen;
	}

	public void setIdBloqueOrigen(Integer idBloqueOrigen) {
		this.idBloqueOrigen = idBloqueOrigen;
	}

	public String getCodigoBloqueOrigen() {
		return codigoBloqueOrigen;
	}

	public void setCodigoBloqueOrigen(String codigoBloqueOrigen) {
		this.codigoBloqueOrigen = codigoBloqueOrigen;
	}

	public Integer getDocComunIdDestino() {
		return docComunIdDestino;
	}

	public void setDocComunIdDestino(Integer docComunIdDestino) {
		this.docComunIdDestino = docComunIdDestino;
	}

	public Integer getIdDocumentoDestino() {
		return idDocumentoDestino;
	}

	public void setIdDocumentoDestino(Integer idDocumentoDestino) {
		this.idDocumentoDestino = idDocumentoDestino;
	}

	public Integer getIdMetadatoDestino() {
		return idMetadatoDestino;
	}

	public void setIdMetadatoDestino(Integer idMetadatoDestino) {
		this.idMetadatoDestino = idMetadatoDestino;
	}

	public Integer getIdBloqueDestino() {
		return idBloqueDestino;
	}

	public void setIdBloqueDestino(Integer idBloqueDestino) {
		this.idBloqueDestino = idBloqueDestino;
	}

	public String getCodigoBloqueDestino() {
		return codigoBloqueDestino;
	}

	public void setCodigoBloqueDestino(String codigoBloqueDestino) {
		this.codigoBloqueDestino = codigoBloqueDestino;
	}
}
