package com.example.workflowapp.repository;

import com.example.workflowapp.model.UsuariosPreAsignados;
import com.example.workflowapp.model.UsuariosPreAsignadosId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuariosPreAsignadosRepository extends JpaRepository<UsuariosPreAsignados, UsuariosPreAsignadosId> {

	List<UsuariosPreAsignados> findByIdActivityId(Integer activityId);
}
