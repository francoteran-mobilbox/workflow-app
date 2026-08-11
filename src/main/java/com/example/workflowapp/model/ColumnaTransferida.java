package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "columna_transferida")
public class ColumnaTransferida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_columna_transferida")
	private Integer idColumnaTransferida;

	@Column(name = "id_documento")
	private Integer idDocumento;

	@Column(name = "id_metadato")
	private Integer idMetadato;

	@Column(name = "id_bloque")
	private Integer idBloque;

	@Column(name = "id_columna_grilla_dest")
	private Integer idColumnaGrillaDest;

	@Column(name = "id_columna_grilla_origen")
	private Integer idColumnaGrillaOrigen;

	@Column(name = "id_actividad")
	private Integer idActividad;

	@Column(name = "id_doc_comun")
	private Integer idDocComun;

	@Column(name = "datafield_origen", length = 255)
	private String datafieldOrigen;

	@Column(name = "datafield_destino", length = 255)
	private String datafieldDestino;

	public ColumnaTransferida() {
	}

	public Integer getIdColumnaTransferida() {
		return idColumnaTransferida;
	}

	public void setIdColumnaTransferida(Integer idColumnaTransferida) {
		this.idColumnaTransferida = idColumnaTransferida;
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

	public Integer getIdColumnaGrillaDest() {
		return idColumnaGrillaDest;
	}

	public void setIdColumnaGrillaDest(Integer idColumnaGrillaDest) {
		this.idColumnaGrillaDest = idColumnaGrillaDest;
	}

	public Integer getIdColumnaGrillaOrigen() {
		return idColumnaGrillaOrigen;
	}

	public void setIdColumnaGrillaOrigen(Integer idColumnaGrillaOrigen) {
		this.idColumnaGrillaOrigen = idColumnaGrillaOrigen;
	}

	public Integer getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	public Integer getIdDocComun() {
		return idDocComun;
	}

	public void setIdDocComun(Integer idDocComun) {
		this.idDocComun = idDocComun;
	}

	public String getDatafieldOrigen() {
		return datafieldOrigen;
	}

	public void setDatafieldOrigen(String datafieldOrigen) {
		this.datafieldOrigen = datafieldOrigen;
	}

	public String getDatafieldDestino() {
		return datafieldDestino;
	}

	public void setDatafieldDestino(String datafieldDestino) {
		this.datafieldDestino = datafieldDestino;
	}
}
