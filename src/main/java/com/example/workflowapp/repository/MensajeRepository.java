package com.example.workflowapp.repository;

import com.example.workflowapp.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {

	Optional<Mensaje> findFirstByActivityId(Integer activityId);
}
