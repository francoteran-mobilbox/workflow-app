package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "operando_regla")
public class OperandoRegla {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_operando_regla")
	private Integer idOperandoRegla;

	@Column(name = "valor_operando")
	private String valorOperando;

	@Column(name = "es_doc")
	private Boolean esDoc;

	public OperandoRegla() {
	}

	public Integer getIdOperandoRegla() {
		return idOperandoRegla;
	}

	public void setIdOperandoRegla(Integer idOperandoRegla) {
		this.idOperandoRegla = idOperandoRegla;
	}

	public String getValorOperando() {
		return valorOperando;
	}

	public void setValorOperando(String valorOperando) {
		this.valorOperando = valorOperando;
	}

	public Boolean getEsDoc() {
		return esDoc;
	}

	public void setEsDoc(Boolean esDoc) {
		this.esDoc = esDoc;
	}
}