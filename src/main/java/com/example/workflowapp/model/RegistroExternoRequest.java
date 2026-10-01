package com.example.workflowapp.model;

import java.util.Collections;
import java.util.List;

public class RegistroExternoRequest {

	private RegistroExternoActivity registroExterno;

	private List<ClaveRegistroExterno> claves = Collections.emptyList();

	public RegistroExternoActivity getRegistroExterno() {
		return registroExterno;
	}

	public void setRegistroExterno(RegistroExternoActivity registroExterno) {
		this.registroExterno = registroExterno;
	}

	public List<ClaveRegistroExterno> getClaves() {
		return claves;
	}

	public void setClaves(List<ClaveRegistroExterno> claves) {
		this.claves = claves;
	}
}