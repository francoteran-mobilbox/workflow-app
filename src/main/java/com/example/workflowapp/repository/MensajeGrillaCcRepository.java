package com.example.workflowapp.repository;

import com.example.workflowapp.model.MensajeGrillaCc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MensajeGrillaCcRepository extends JpaRepository<MensajeGrillaCc, Integer> {

	List<MensajeGrillaCc> findByIdMetadatoDestCc(Integer idMetadatoDestCc);
}
