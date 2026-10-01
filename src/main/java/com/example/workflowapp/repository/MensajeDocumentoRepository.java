package com.example.workflowapp.repository;

import com.example.workflowapp.model.MensajeDocumento;
import com.example.workflowapp.model.MensajeDocumentoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MensajeDocumentoRepository extends JpaRepository<MensajeDocumento, MensajeDocumentoId> {

	List<MensajeDocumento> findByIdIdMensaje(Integer idMensaje);
}
