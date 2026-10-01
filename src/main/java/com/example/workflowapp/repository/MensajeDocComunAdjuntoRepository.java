package com.example.workflowapp.repository;

import com.example.workflowapp.model.MensajeDocComunAdjunto;
import com.example.workflowapp.model.MensajeDocComunAdjuntoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MensajeDocComunAdjuntoRepository extends JpaRepository<MensajeDocComunAdjunto, MensajeDocComunAdjuntoId> {

	List<MensajeDocComunAdjunto> findByIdIdMensaje(Integer idMensaje);
}
