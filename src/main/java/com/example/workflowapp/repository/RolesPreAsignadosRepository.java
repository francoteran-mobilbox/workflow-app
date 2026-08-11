package com.example.workflowapp.repository;

import com.example.workflowapp.model.RolesPreAsignados;
import com.example.workflowapp.model.RolesPreAsignadosId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolesPreAsignadosRepository extends JpaRepository<RolesPreAsignados, RolesPreAsignadosId> {

	List<RolesPreAsignados> findByIdActivityId(Integer activityId);
}
