package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "operando_regla_documento")
public class OperandoReglaDocumento {

	@Id
	@Column(name = "id_operando_regla", nullable = false)
	private Integer idOperandoRegla;

	@Column(name = "doc_comun_id")
	private Integer docComunId;

	@Column(name = "id_bloque")
	private Integer idBloque;

	@Column(name = "codigo_bloque")
	private String codigoBloque;

	@Column(name = "id_metadato")
	private Integer idMetadato;

	@Column(name = "id_tipo_dato")
	private String idTipoDato;

	public OperandoReglaDocumento() {
	}

	public Integer getIdOperandoRegla() {
		return idOperandoRegla;
	}

	public void setIdOperandoRegla(Integer idOperandoRegla) {
		this.idOperandoRegla = idOperandoRegla;
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
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

	public Integer getIdMetadato() {
		return idMetadato;
	}

	public void setIdMetadato(Integer idMetadato) {
		this.idMetadato = idMetadato;
	}

	public String getIdTipoDato() {
		return idTipoDato;
	}

	public void setIdTipoDato(String idTipoDato) {
		this.idTipoDato = idTipoDato;
	}
}