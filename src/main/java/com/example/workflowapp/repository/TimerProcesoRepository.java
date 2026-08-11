package com.example.workflowapp.repository;

import com.example.workflowapp.model.TimerProceso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimerProcesoRepository extends JpaRepository<TimerProceso, Integer> {
}
