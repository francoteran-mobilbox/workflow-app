package com.example.workflowapp.repository;

import com.example.workflowapp.model.MetaDisponiblesActividad;
import com.example.workflowapp.model.MetaDisponiblesActividadId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetaDisponiblesActividadRepository extends JpaRepository<MetaDisponiblesActividad, MetaDisponiblesActividadId> {

	List<MetaDisponiblesActividad> findByIdActivityId(Integer activityId);
}
