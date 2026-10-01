package com.example.workflowapp.repository;

import com.example.workflowapp.model.MetadatoDestinoMensajeCc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetadatoDestinoMensajeCcRepository extends JpaRepository<MetadatoDestinoMensajeCc, Integer> {

	List<MetadatoDestinoMensajeCc> findByIdMensaje(Integer idMensaje);
}
