package com.example.workflowapp.repository;

import com.example.workflowapp.model.RolMensaje;
import com.example.workflowapp.model.RolMensajeId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolMensajeRepository extends JpaRepository<RolMensaje, RolMensajeId> {

	List<RolMensaje> findByIdIdMensaje(Integer idMensaje);
}
