package com.example.workflowapp.repository;

import com.example.workflowapp.model.MetadatoDestinoMensaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetadatoDestinoMensajeRepository extends JpaRepository<MetadatoDestinoMensaje, Integer> {

	List<MetadatoDestinoMensaje> findByIdMensaje(Integer idMensaje);
}
