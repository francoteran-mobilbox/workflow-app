package com.example.workflowapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "documento_comun_proceso")
public class DocumentoComunProceso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doc_comun_id")
	private Integer docComunId;

	@Column(name = "id_documento")
	private Integer idDocumento;

	@Column(name = "process_id")
	private Integer processId;

	@Column(name = "nombre_doc_comun")
	private String nombreDocComun;

	@Column(name = "privado")
	private Boolean privado;

	@Column(name = "compartido")
	private Boolean compartido;

	public DocumentoComunProceso() {
	}

	public Integer getDocComunId() {
		return docComunId;
	}

	public void setDocComunId(Integer docComunId) {
		this.docComunId = docComunId;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public String getNombreDocComun() {
		return nombreDocComun;
	}

	public void setNombreDocComun(String nombreDocComun) {
		this.nombreDocComun = nombreDocComun;
	}

	public Boolean getPrivado() {
		return privado;
	}

	public void setPrivado(Boolean privado) {
		this.privado = privado;
	}

	public Boolean getCompartido() {
		return compartido;
	}

	public void setCompartido(Boolean compartido) {
		this.compartido = compartido;
	}
}
