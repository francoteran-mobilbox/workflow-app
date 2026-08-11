package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "metadato_req_proceso")
public class MetadatoReqProceso {

	@Id
	@Column(name = "id_dato_req_proceso")
	private Integer idDatoReqProceso;

	@Column(name = "id_documento")
	private Integer idDocumento;

	@Column(name = "id_metadato")
	private Integer idMetadato;

	@Column(name = "id_bloque")
	private Integer idBloque;

	@Column(name = "codigo_bloque")
	private String codigoBloque;

	@Column(name = "doc_comun_id")
	private Integer docComunId;

	public MetadatoReqProceso() {
	}

	public Integer getIdDatoReqProceso() {
		return idDatoReqProceso;
	}

	public void setIdDatoReqProceso(Integer idDatoReqProceso) {
		this.idDatoReqProceso = idDatoReqProceso;
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

	public String getCodigoBloque() {
		return codigoBloque;
	}

	public void setCodigoBloque(String codigoBloque) {
		this.codigoBloque = codigoBloque;
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
	}
}
