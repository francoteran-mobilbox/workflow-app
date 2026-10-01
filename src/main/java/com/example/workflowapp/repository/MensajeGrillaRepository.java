package com.example.workflowapp.repository;

import com.example.workflowapp.model.MensajeGrilla;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MensajeGrillaRepository extends JpaRepository<MensajeGrilla, Integer> {

	List<MensajeGrilla> findByIdMetadatoDestMensaje(Integer idMetadatoDestMensaje);
}
