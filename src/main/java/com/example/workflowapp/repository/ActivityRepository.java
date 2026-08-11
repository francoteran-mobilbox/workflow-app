package com.example.workflowapp.repository;

import com.example.workflowapp.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {

	List<Activity> findByProcessId(Integer processId);
}
