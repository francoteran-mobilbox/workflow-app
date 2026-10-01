package com.example.workflowapp.repository;

import com.example.workflowapp.model.DocumentoComunProceso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DocumentoComunProcesoRepository extends JpaRepository<DocumentoComunProceso, Integer> {

	List<DocumentoComunProceso> findByProcessId(Integer processId);

	Optional<DocumentoComunProceso> findByProcessIdAndNombreDocComun(Integer processId, String nombreDocComun);
}
