package com.example.workflowapp.repository;

import com.example.workflowapp.model.ActivitiesSubProceso;
import com.example.workflowapp.model.ActivitiesSubProcesoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivitiesSubProcesoRepository extends JpaRepository<ActivitiesSubProceso, ActivitiesSubProcesoId> {

	List<ActivitiesSubProceso> findByIdActivityId(Integer activityId);
}
