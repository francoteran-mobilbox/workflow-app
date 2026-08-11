package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "regla_de_negocio")
public class ReglaDeNegocio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_regla_negocio")
	private Integer idReglaNegocio;

	@Column(name = "id_operador_regla")
	private String idOperadorRegla;

	@Column(name = "id_operando_izq")
	private Integer idOperandoIzq;

	@Column(name = "id_operando_der")
	private Integer idOperandoDer;

	public ReglaDeNegocio() {
	}

	public Integer getIdReglaNegocio() {
		return idReglaNegocio;
	}

	public void setIdReglaNegocio(Integer idReglaNegocio) {
		this.idReglaNegocio = idReglaNegocio;
	}

	public String getIdOperadorRegla() {
		return idOperadorRegla;
	}

	public void setIdOperadorRegla(String idOperadorRegla) {
		this.idOperadorRegla = idOperadorRegla;
	}

	public Integer getIdOperandoIzq() {
		return idOperandoIzq;
	}

	public void setIdOperandoIzq(Integer idOperandoIzq) {
		this.idOperandoIzq = idOperandoIzq;
	}

	public Integer getIdOperandoDer() {
		return idOperandoDer;
	}

	public void setIdOperandoDer(Integer idOperandoDer) {
		this.idOperandoDer = idOperandoDer;
	}
}