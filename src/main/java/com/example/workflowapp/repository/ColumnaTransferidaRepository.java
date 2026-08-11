package com.example.workflowapp.repository;

import com.example.workflowapp.model.ColumnaTransferida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColumnaTransferidaRepository extends JpaRepository<ColumnaTransferida, Integer> {

	List<ColumnaTransferida> findByIdActividad(Integer idActividad);
}
