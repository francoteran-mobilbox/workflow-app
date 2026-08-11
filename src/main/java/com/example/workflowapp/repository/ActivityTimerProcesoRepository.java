package com.example.workflowapp.repository;

import com.example.workflowapp.model.ActivityTimerProceso;
import com.example.workflowapp.model.ActivityTimerProcesoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityTimerProcesoRepository extends JpaRepository<ActivityTimerProceso, ActivityTimerProcesoId> {

	List<ActivityTimerProceso> findByIdActivityId(Integer activityId);
}
