package com.example.workflowapp.repository;

import com.example.workflowapp.model.ElementosRequeridos;
import com.example.workflowapp.model.ElementosRequeridosId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ElementosRequeridosRepository extends JpaRepository<ElementosRequeridos, ElementosRequeridosId> {

	List<ElementosRequeridos> findByIdActivityId(Integer activityId);
}
