package com.example.workflowapp.repository;

import com.example.workflowapp.model.ResponsableProceso;
import com.example.workflowapp.model.ResponsableProcesoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsableProcesoRepository extends JpaRepository<ResponsableProceso, ResponsableProcesoId> {
}
