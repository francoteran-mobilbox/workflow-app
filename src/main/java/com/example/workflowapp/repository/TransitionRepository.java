package com.example.workflowapp.repository;

import com.example.workflowapp.model.Transition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransitionRepository extends JpaRepository<Transition, Integer> {

	List<Transition> findByProcessId(Integer processId);
}