package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "metadato_transferido_columna")
public class MetadatoTransferidoColumna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_metadato_transferido_columna")
	private Integer idMetadatoTransferidoColumna;

	@Column(name = "id_documento")
	private Integer idDocumento;

	@Column(name = "id_metadato_origen")
	private Integer idMetadatoOrigen;

	@Column(name = "id_metadato_destino")
	private Integer idMetadatoDestino;

	@Column(name = "id_columna_grilla_destino")
	private Integer idColumnaGrillaDestino;

	@Column(name = "id_documento_comun")
	private Integer idDocumentoComun;

	@Column(name = "id_actividad")
	private Integer idActividad;

	@Column(name = "id_datafield_destino")
	private String idDatafieldDestino;

	public MetadatoTransferidoColumna() {
	}

	public Integer getIdMetadatoTransferidoColumna() {
		return idMetadatoTransferidoColumna;
	}

	public void setIdMetadatoTransferidoColumna(Integer idMetadatoTransferidoColumna) {
		this.idMetadatoTransferidoColumna = idMetadatoTransferidoColumna;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getIdMetadatoOrigen() {
		return idMetadatoOrigen;
	}

	public void setIdMetadatoOrigen(Integer idMetadatoOrigen) {
		this.idMetadatoOrigen = idMetadatoOrigen;
	}

	public Integer getIdMetadatoDestino() {
		return idMetadatoDestino;
	}

	public void setIdMetadatoDestino(Integer idMetadatoDestino) {
		this.idMetadatoDestino = idMetadatoDestino;
	}

	public Integer getIdColumnaGrillaDestino() {
		return idColumnaGrillaDestino;
	}

	public void setIdColumnaGrillaDestino(Integer idColumnaGrillaDestino) {
		this.idColumnaGrillaDestino = idColumnaGrillaDestino;
	}

	public Integer getIdDocumentoComun() {
		return idDocumentoComun;
	}

	public void setIdDocumentoComun(Integer idDocumentoComun) {
		this.idDocumentoComun = idDocumentoComun;
	}

	public Integer getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	public String getIdDatafieldDestino() {
		return idDatafieldDestino;
	}

	public void setIdDatafieldDestino(String idDatafieldDestino) {
		this.idDatafieldDestino = idDatafieldDestino;
	}
}
