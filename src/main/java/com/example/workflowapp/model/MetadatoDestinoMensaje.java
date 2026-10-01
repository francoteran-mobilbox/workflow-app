package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "metadato_destino_mensaje")
public class MetadatoDestinoMensaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_metadato_dest")
	private Integer idMetadatoDest;

	@Column(name = "id_mensaje", nullable = false)
	private Integer idMensaje;

	@Column(name = "doc_comun_id", nullable = false)
	private Integer docComunId;

	@Column(name = "id_metadato", nullable = false)
	private Integer idMetadato;

	@Column(name = "id_bloque", nullable = false)
	private Integer idBloque;

	@Column(name = "es_grilla")
	private Boolean esGrilla;

	@Column(name = "codigo_bloque")
	private String codigoBloque;

	public MetadatoDestinoMensaje() {
	}

	public Integer getIdMetadatoDest() {
		return idMetadatoDest;
	}

	public void setIdMetadatoDest(Integer idMetadatoDest) {
		this.idMetadatoDest = idMetadatoDest;
	}

	public Integer getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Integer idMensaje) {
		this.idMensaje = idMensaje;
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
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

	public Boolean getEsGrilla() {
		return esGrilla;
	}

	public void setEsGrilla(Boolean esGrilla) {
		this.esGrilla = esGrilla;
	}

	public String getCodigoBloque() {
		return codigoBloque;
	}

	public void setCodigoBloque(String codigoBloque) {
		this.codigoBloque = codigoBloque;
	}
}
