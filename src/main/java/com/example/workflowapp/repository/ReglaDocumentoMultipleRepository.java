package com.example.workflowapp.repository;

import com.example.workflowapp.model.ReglaDocumentoMultiple;
import com.example.workflowapp.model.ReglaDocumentoMultipleId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReglaDocumentoMultipleRepository extends JpaRepository<ReglaDocumentoMultiple, ReglaDocumentoMultipleId> {

	List<ReglaDocumentoMultiple> findByIdActivityId(Integer activityId);
}
