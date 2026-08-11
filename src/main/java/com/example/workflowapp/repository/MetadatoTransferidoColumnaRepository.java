package com.example.workflowapp.repository;

import com.example.workflowapp.model.MetadatoTransferidoColumna;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetadatoTransferidoColumnaRepository extends JpaRepository<MetadatoTransferidoColumna, Integer> {

	List<MetadatoTransferidoColumna> findByIdActividad(Integer idActividad);
}
