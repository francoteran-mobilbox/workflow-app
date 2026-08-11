package com.example.workflowapp.repository;

import com.example.workflowapp.model.ActivityClaveRegExterno;
import com.example.workflowapp.model.ActivityClaveRegExternoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityClaveRegExternoRepository extends JpaRepository<ActivityClaveRegExterno, ActivityClaveRegExternoId> {

	List<ActivityClaveRegExterno> findByIdActivityId(Integer activityId);
}
