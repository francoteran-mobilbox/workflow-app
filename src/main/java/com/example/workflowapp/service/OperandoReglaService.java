package com.example.workflowapp.service;

import com.example.workflowapp.model.OperandoRegla;
import com.example.workflowapp.model.OperandoReglaDocumento;
import com.example.workflowapp.model.OperandoReglaResponse;
import com.example.workflowapp.repository.OperandoReglaDocumentoRepository;
import com.example.workflowapp.repository.OperandoReglaRepository;
import org.springframework.stereotype.Service;

@Service
public class OperandoReglaService {

	private final OperandoReglaRepository operandoReglaRepository;

	private final OperandoReglaDocumentoRepository documentoRepository;

	public OperandoReglaService(OperandoReglaRepository operandoReglaRepository,
			OperandoReglaDocumentoRepository documentoRepository) {
		this.operandoReglaRepository = operandoReglaRepository;
		this.documentoRepository = documentoRepository;
	}

	public OperandoReglaResponse getOperandoReglaConDetalle(Integer idOperandoRegla) {
		OperandoRegla operandoRegla = operandoReglaRepository.findById(idOperandoRegla).orElse(null);
		OperandoReglaDocumento documento = documentoRepository.findById(idOperandoRegla).orElse(null);
		return new OperandoReglaResponse(operandoRegla, documento);
	}
}