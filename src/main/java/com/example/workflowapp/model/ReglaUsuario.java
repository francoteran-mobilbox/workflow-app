package com.example.workflowapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "regla_usuario")
public class ReglaUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_regla_usuario")
	private Integer idReglaUsuario;

	@Column(name = "id_doc_izq")
	private Integer idDocIzq;

	@Column(name = "id_bloq_izq")
	private Integer idBloqIzq;

	@Column(name = "codigo_bloq_izq")
	private String codigoBloqIzq;

	@Column(name = "id_met_izq")
	private Integer idMetIzq;

	@Column(name = "id_rol_der")
	private Integer idRolDer;

	@Column(name = "id_bloq_der")
	private Integer idBloqDer;

	@Column(name = "codigo_bloq_der")
	private String codigoBloqDer;

	@Column(name = "id_met_der")
	private Integer idMetDer;

	@Column(name = "campo_valor2")
	private Boolean campoValor2;

	@Transient
	private String nombreDocComun;

	public ReglaUsuario() {
	}

	public Integer getIdReglaUsuario() {
		return idReglaUsuario;
	}

	public void setIdReglaUsuario(Integer idReglaUsuario) {
		this.idReglaUsuario = idReglaUsuario;
	}

	public Integer getIdDocIzq() {
		return idDocIzq;
	}

	public void setIdDocIzq(Integer idDocIzq) {
		this.idDocIzq = idDocIzq;
	}

	public Integer getIdBloqIzq() {
		return idBloqIzq;
	}

	public void setIdBloqIzq(Integer idBloqIzq) {
		this.idBloqIzq = idBloqIzq;
	}

	public String getCodigoBloqIzq() {
		return codigoBloqIzq;
	}

	public void setCodigoBloqIzq(String codigoBloqIzq) {
		this.codigoBloqIzq = codigoBloqIzq;
	}

	public Integer getIdMetIzq() {
		return idMetIzq;
	}

	public void setIdMetIzq(Integer idMetIzq) {
		this.idMetIzq = idMetIzq;
	}

	public Integer getIdRolDer() {
		return idRolDer;
	}

	public void setIdRolDer(Integer idRolDer) {
		this.idRolDer = idRolDer;
	}

	public Integer getIdBloqDer() {
		return idBloqDer;
	}

	public void setIdBloqDer(Integer idBloqDer) {
		this.idBloqDer = idBloqDer;
	}

	public String getCodigoBloqDer() {
		return codigoBloqDer;
	}

	public void setCodigoBloqDer(String codigoBloqDer) {
		this.codigoBloqDer = codigoBloqDer;
	}

	public Integer getIdMetDer() {
		return idMetDer;
	}

	public void setIdMetDer(Integer idMetDer) {
		this.idMetDer = idMetDer;
	}

	public Boolean getCampoValor2() {
		return campoValor2;
	}

	public void setCampoValor2(Boolean campoValor2) {
		this.campoValor2 = campoValor2;
	}

	public String getNombreDocComun() {
		return nombreDocComun;
	}

	public void setNombreDocComun(String nombreDocComun) {
		this.nombreDocComun = nombreDocComun;
	}
}