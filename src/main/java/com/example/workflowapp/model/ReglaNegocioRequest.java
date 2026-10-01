package com.example.workflowapp.model;

public class ReglaNegocioRequest {

	private String idOperadorRegla;

	private OperandoReglaRequest operandoIzq;

	private OperandoReglaRequest operandoDer;

	public String getIdOperadorRegla() {
		return idOperadorRegla;
	}

	public void setIdOperadorRegla(String idOperadorRegla) {
		this.idOperadorRegla = idOperadorRegla;
	}

	public OperandoReglaRequest getOperandoIzq() {
		return operandoIzq;
	}

	public void setOperandoIzq(OperandoReglaRequest operandoIzq) {
		this.operandoIzq = operandoIzq;
	}

	public OperandoReglaRequest getOperandoDer() {
		return operandoDer;
	}

	public void setOperandoDer(OperandoReglaRequest operandoDer) {
		this.operandoDer = operandoDer;
	}
}