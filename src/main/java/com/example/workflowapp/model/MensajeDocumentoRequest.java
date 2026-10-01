package com.example.workflowapp.model;

public class MensajeDocumentoRequest {

	private Integer idDocumento;

	private Integer minimoRespuestas;

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Integer getMinimoRespuestas() {
		return minimoRespuestas;
	}

	public void setMinimoRespuestas(Integer minimoRespuestas) {
		this.minimoRespuestas = minimoRespuestas;
	}
}
