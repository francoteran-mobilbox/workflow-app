package com.example.workflowapp.model;

public class OperandoReglaResponse {

	private OperandoRegla operandoRegla;

	private OperandoReglaDocumento documento;

	public OperandoReglaResponse() {
	}

	public OperandoReglaResponse(OperandoRegla operandoRegla, OperandoReglaDocumento documento) {
		this.operandoRegla = operandoRegla;
		this.documento = documento;
	}

	public OperandoRegla getOperandoRegla() {
		return operandoRegla;
	}

	public void setOperandoRegla(OperandoRegla operandoRegla) {
		this.operandoRegla = operandoRegla;
	}

	public OperandoReglaDocumento getDocumento() {
		return documento;
	}

	public void setDocumento(OperandoReglaDocumento documento) {
		this.documento = documento;
	}
}