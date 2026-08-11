package com.example.workflowapp.repository;

import com.example.workflowapp.model.Runningprocess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RunningprocessRepository extends JpaRepository<Runningprocess, Integer> {

	List<Runningprocess> findByProcessId(Integer processId);
}