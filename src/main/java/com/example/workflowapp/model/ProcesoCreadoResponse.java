package com.example.workflowapp.model;

public class ProcesoCreadoResponse {

	private Integer processId;

	public ProcesoCreadoResponse() {
	}

	public ProcesoCreadoResponse(Integer processId) {
		this.processId = processId;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}
}