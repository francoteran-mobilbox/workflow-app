package com.example.workflowapp.repository;

import com.example.workflowapp.model.GrillaMetadatoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GrillaMetadatoDocumentoRepository extends JpaRepository<GrillaMetadatoDocumento, Integer> {

	List<GrillaMetadatoDocumento> findByidDocumento(Integer idDocumento);
}