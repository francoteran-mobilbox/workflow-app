package com.example.workflowapp.repository;

import com.example.workflowapp.model.UsuarioMensaje;
import com.example.workflowapp.model.UsuarioMensajeId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioMensajeRepository extends JpaRepository<UsuarioMensaje, UsuarioMensajeId> {

	List<UsuarioMensaje> findByIdIdMensaje(Integer idMensaje);
}
