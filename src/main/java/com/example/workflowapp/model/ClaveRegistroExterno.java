package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clave_registro_externo")
public class ClaveRegistroExterno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_clave_registro_externo")
	private Integer idClaveRegistroExterno;

	@Column(name = "id_bloque_origen")
	private Integer idBloqueOrigen;

	@Column(name = "codigo_bloque_origen")
	private String codigoBloqueOrigen;

	@Column(name = "nombre_bloque_origen")
	private String nombreBloqueOrigen;

	@Column(name = "id_metadato_origen")
	private Integer idMetadatoOrigen;

	@Column(name = "nombre_metadato_origen")
	private String nombreMetadatoOrigen;

	@Column(name = "id_bloque_destino")
	private Integer idBloqueDestino;

	@Column(name = "codigo_bloque_destino")
	private String codigoBloqueDestino;

	@Column(name = "nombre_bloque_destino")
	private String nombreBloqueDestino;

	@Column(name = "id_metadato_destino")
	private Integer idMetadatoDestino;

	@Column(name = "nombre_metadato_destino")
	private String nombreMetadatoDestino;

	public ClaveRegistroExterno() {
	}

	public Integer getIdClaveRegistroExterno() {
		return idClaveRegistroExterno;
	}

	public void setIdClaveRegistroExterno(Integer idClaveRegistroExterno) {
		this.idClaveRegistroExterno = idClaveRegistroExterno;
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

	public String getNombreBloqueOrigen() {
		return nombreBloqueOrigen;
	}

	public void setNombreBloqueOrigen(String nombreBloqueOrigen) {
		this.nombreBloqueOrigen = nombreBloqueOrigen;
	}

	public Integer getIdMetadatoOrigen() {
		return idMetadatoOrigen;
	}

	public void setIdMetadatoOrigen(Integer idMetadatoOrigen) {
		this.idMetadatoOrigen = idMetadatoOrigen;
	}

	public String getNombreMetadatoOrigen() {
		return nombreMetadatoOrigen;
	}

	public void setNombreMetadatoOrigen(String nombreMetadatoOrigen) {
		this.nombreMetadatoOrigen = nombreMetadatoOrigen;
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

	public String getNombreBloqueDestino() {
		return nombreBloqueDestino;
	}

	public void setNombreBloqueDestino(String nombreBloqueDestino) {
		this.nombreBloqueDestino = nombreBloqueDestino;
	}

	public Integer getIdMetadatoDestino() {
		return idMetadatoDestino;
	}

	public void setIdMetadatoDestino(Integer idMetadatoDestino) {
		this.idMetadatoDestino = idMetadatoDestino;
	}

	public String getNombreMetadatoDestino() {
		return nombreMetadatoDestino;
	}

	public void setNombreMetadatoDestino(String nombreMetadatoDestino) {
		this.nombreMetadatoDestino = nombreMetadatoDestino;
	}
}
