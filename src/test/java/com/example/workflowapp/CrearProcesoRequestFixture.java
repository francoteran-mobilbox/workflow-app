package com.example.workflowapp;

import com.example.workflowapp.model.ActivitiesSubProceso;
import com.example.workflowapp.model.ActivitiesSubProcesoId;
import com.example.workflowapp.model.Activity;
import com.example.workflowapp.model.ActivityClaveRegExterno;
import com.example.workflowapp.model.ActivityClaveRegExternoId;
import com.example.workflowapp.model.ActivityTimerProceso;
import com.example.workflowapp.model.ActivityTimerProcesoId;
import com.example.workflowapp.model.ActividadRequest;
import com.example.workflowapp.model.ClaveRegistroExterno;
import com.example.workflowapp.model.CondicionVisibilidadProceso;
import com.example.workflowapp.model.CondicionVisibilidadRequest;
import com.example.workflowapp.model.CrearProcesoRequest;
import com.example.workflowapp.model.DatoMecanismoRequest;
import com.example.workflowapp.model.DatoReqProceso;
import com.example.workflowapp.model.DatoReqProcesoRequest;
import com.example.workflowapp.model.DocumentoComunActividad;
import com.example.workflowapp.model.DocumentoComunActividadId;
import com.example.workflowapp.model.DocumentoComunActividadRequest;
import com.example.workflowapp.model.DocumentoComunPermisosRequest;
import com.example.workflowapp.model.DocumentoComunProceso;
import com.example.workflowapp.model.ElementosRequeridos;
import com.example.workflowapp.model.ElementosRequeridosRequest;
import com.example.workflowapp.model.MetaDisponiblesActividad;
import com.example.workflowapp.model.MetaDisponiblesActividadId;
import com.example.workflowapp.model.MetadatoReqProceso;
import com.example.workflowapp.model.MetadatoTransferidoActividad;
import com.example.workflowapp.model.ColumnaGrillaMensajeRequest;
import com.example.workflowapp.model.DestinatarioMetadatoRequest;
import com.example.workflowapp.model.Mensaje;
import com.example.workflowapp.model.MensajeActividadRequest;
import com.example.workflowapp.model.MensajeDocComunAdjunto;
import com.example.workflowapp.model.MensajeDocumento;
import com.example.workflowapp.model.MensajeDocumentoRequest;
import com.example.workflowapp.model.MensajeGrilla;
import com.example.workflowapp.model.MensajeGrillaCc;
import com.example.workflowapp.model.MetadatoDestinoMensaje;
import com.example.workflowapp.model.MetadatoDestinoMensajeCc;
import com.example.workflowapp.model.OperandoRegla;
import com.example.workflowapp.model.OperandoReglaDocumento;
import com.example.workflowapp.model.OperandoReglaRequest;
import com.example.workflowapp.model.PermisoProceso;
import com.example.workflowapp.model.PermisoGrupoDocComun;
import com.example.workflowapp.model.PermisoGrupoProceso;
import com.example.workflowapp.model.PermisoProcesoCondicion;
import com.example.workflowapp.model.PermisoRolDocComun;
import com.example.workflowapp.model.PermisoRolProceso;
import com.example.workflowapp.model.PermisoUsuarioDocComun;
import com.example.workflowapp.model.ProcesoCatalogo;
import com.example.workflowapp.model.ProcesoMecanismoDenominacion;
import com.example.workflowapp.model.RegistroExternoActivity;
import com.example.workflowapp.model.RegistroExternoRequest;
import com.example.workflowapp.model.RolMensaje;
import com.example.workflowapp.model.UsuarioMensaje;
import com.example.workflowapp.model.ReglaDeNegocio;
import com.example.workflowapp.model.ReglaDocumentoMultiple;
import com.example.workflowapp.model.ReglaDocumentoMultipleId;
import com.example.workflowapp.model.ReglaNegocioRequest;
import com.example.workflowapp.model.ReglaUsuario;
import com.example.workflowapp.model.ResponsableProceso;
import com.example.workflowapp.model.ResponsableProcesoRequest;
import com.example.workflowapp.model.RolGenericoActividad;
import com.example.workflowapp.model.RolGenericoActividadRequest;
import com.example.workflowapp.model.RolGenericoProceso;
import com.example.workflowapp.model.RolGenericoProcesoRequest;
import com.example.workflowapp.model.RolesPreAsignados;
import com.example.workflowapp.model.TimerProceso;
import com.example.workflowapp.model.TransicionRequest;
import com.example.workflowapp.model.Transition;
import com.example.workflowapp.model.TransitionReglaNegocio;
import com.example.workflowapp.model.TransitionReglaUsuario;
import com.example.workflowapp.model.TransitionTimerProceso;
import com.example.workflowapp.model.UsuarioPreAsignadoRequest;
import com.example.workflowapp.model.UsuariosPreAsignados;
import com.example.workflowapp.model.WorkflowProcess;
import com.example.workflowapp.repository.ActivitiesSubProcesoRepository;
import com.example.workflowapp.repository.ActivityClaveRegExternoRepository;
import com.example.workflowapp.repository.ActivityRepository;
import com.example.workflowapp.repository.ActivityTimerProcesoRepository;
import com.example.workflowapp.repository.ClaveRegistroExternoRepository;
import com.example.workflowapp.repository.CondicionVisibilidadProcesoRepository;
import com.example.workflowapp.repository.DatoReqProcesoRepository;
import com.example.workflowapp.repository.DocumentoComunActividadRepository;
import com.example.workflowapp.repository.DocumentoComunProcesoRepository;
import com.example.workflowapp.repository.ElementosRequeridosRepository;
import com.example.workflowapp.repository.MetaDisponiblesActividadRepository;
import com.example.workflowapp.repository.MensajeDocComunAdjuntoRepository;
import com.example.workflowapp.repository.MensajeDocumentoRepository;
import com.example.workflowapp.repository.MensajeGrillaCcRepository;
import com.example.workflowapp.repository.MensajeGrillaRepository;
import com.example.workflowapp.repository.MensajeRepository;
import com.example.workflowapp.repository.MetadatoDestinoMensajeCcRepository;
import com.example.workflowapp.repository.MetadatoDestinoMensajeRepository;
import com.example.workflowapp.repository.MetadatoReqProcesoRepository;
import com.example.workflowapp.repository.MetadatoTransferidoActividadRepository;
import com.example.workflowapp.repository.OperandoReglaDocumentoRepository;
import com.example.workflowapp.repository.OperandoReglaRepository;
import com.example.workflowapp.repository.PermisoGrupoDocComunRepository;
import com.example.workflowapp.repository.PermisoGrupoProcesoRepository;
import com.example.workflowapp.repository.PermisoProcesoCondicionRepository;
import com.example.workflowapp.repository.PermisoProcesoRepository;
import com.example.workflowapp.repository.PermisoRolDocComunRepository;
import com.example.workflowapp.repository.PermisoRolProcesoRepository;
import com.example.workflowapp.repository.PermisoUsuarioDocComunRepository;
import com.example.workflowapp.repository.ProcesoCatalogoRepository;
import com.example.workflowapp.repository.ProcesoMecanismoDenominacionRepository;
import com.example.workflowapp.repository.ProcessRepository;
import com.example.workflowapp.repository.RegistroExternoActivityRepository;
import com.example.workflowapp.repository.ReglaDeNegocioRepository;
import com.example.workflowapp.repository.ReglaDocumentoMultipleRepository;
import com.example.workflowapp.repository.ReglaUsuarioRepository;
import com.example.workflowapp.repository.ResponsableProcesoRepository;
import com.example.workflowapp.repository.RolesPreAsignadosRepository;
import com.example.workflowapp.repository.RolGenericoActividadRepository;
import com.example.workflowapp.repository.RolGenericoProcesoRepository;
import com.example.workflowapp.repository.RolMensajeRepository;
import com.example.workflowapp.repository.TimerProcesoRepository;
import com.example.workflowapp.repository.TransitionReglaNegocioRepository;
import com.example.workflowapp.repository.TransitionReglaUsuarioRepository;
import com.example.workflowapp.repository.TransitionRepository;
import com.example.workflowapp.repository.TransitionTimerProcesoRepository;
import com.example.workflowapp.repository.UsuarioMensajeRepository;
import com.example.workflowapp.repository.UsuariosPreAsignadosRepository;
import com.example.workflowapp.support.XmlDiagramaUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Construye un CrearProcesoRequest copiando la configuracion completa de un proceso existente
 * (mismo orden del legacy): proceso -> permisos -> roles genericos -> documentos comunes (por nombre) ->
 * responsables/condiciones -> mecanismo de denominacion -> actividades -> transiciones -> publicacion en catalogo.
 * Los ids de fila del origen se limpian para que ProcesoCreadorService recalcule los nuevos.
 */
public class CrearProcesoRequestFixture {

	private final ObjectMapper mapper;

	private final ProcessRepository processRepository;
	private final PermisoProcesoRepository permisoProcesoRepository;
	private final PermisoRolProcesoRepository permisoRolProcesoRepository;
	private final PermisoGrupoProcesoRepository permisoGrupoProcesoRepository;
	private final RolGenericoProcesoRepository rolGenericoProcesoRepository;
	private final DocumentoComunProcesoRepository documentoComunProcesoRepository;
	private final PermisoUsuarioDocComunRepository permisoUsuarioDocComunRepository;
	private final PermisoRolDocComunRepository permisoRolDocComunRepository;
	private final PermisoGrupoDocComunRepository permisoGrupoDocComunRepository;
	private final ResponsableProcesoRepository responsableProcesoRepository;
	private final CondicionVisibilidadProcesoRepository condicionVisibilidadProcesoRepository;
	private final PermisoProcesoCondicionRepository permisoProcesoCondicionRepository;
	private final ProcesoMecanismoDenominacionRepository procesoMecanismoDenominacionRepository;
	private final DatoReqProcesoRepository datoReqProcesoRepository;
	private final MetadatoReqProcesoRepository metadatoReqProcesoRepository;
	private final ProcesoCatalogoRepository procesoCatalogoRepository;
	private final ActivityRepository activityRepository;
	private final RolGenericoActividadRepository rolGenericoActividadRepository;
	private final DocumentoComunActividadRepository documentoComunActividadRepository;
	private final MetaDisponiblesActividadRepository metaDisponiblesActividadRepository;
	private final ReglaDocumentoMultipleRepository reglaDocumentoMultipleRepository;
	private final MetadatoTransferidoActividadRepository metadatoTransferidoActividadRepository;
	private final ElementosRequeridosRepository elementosRequeridosRepository;
	private final UsuariosPreAsignadosRepository usuariosPreAsignadosRepository;
	private final RolesPreAsignadosRepository rolesPreAsignadosRepository;
	private final ActivitiesSubProcesoRepository activitiesSubProcesoRepository;
	private final RegistroExternoActivityRepository registroExternoActivityRepository;
	private final ClaveRegistroExternoRepository claveRegistroExternoRepository;
	private final ActivityClaveRegExternoRepository activityClaveRegExternoRepository;
	private final TimerProcesoRepository timerProcesoRepository;
	private final ActivityTimerProcesoRepository activityTimerProcesoRepository;
	private final TransitionRepository transitionRepository;
	private final TransitionTimerProcesoRepository transitionTimerProcesoRepository;
	private final ReglaUsuarioRepository reglaUsuarioRepository;
	private final TransitionReglaUsuarioRepository transitionReglaUsuarioRepository;
	private final OperandoReglaRepository operandoReglaRepository;
	private final OperandoReglaDocumentoRepository operandoReglaDocumentoRepository;
	private final ReglaDeNegocioRepository reglaDeNegocioRepository;
	private final TransitionReglaNegocioRepository transitionReglaNegocioRepository;
	private final MensajeRepository mensajeRepository;
	private final UsuarioMensajeRepository usuarioMensajeRepository;
	private final RolMensajeRepository rolMensajeRepository;
	private final MensajeDocumentoRepository mensajeDocumentoRepository;
	private final MetadatoDestinoMensajeRepository metadatoDestinoMensajeRepository;
	private final MetadatoDestinoMensajeCcRepository metadatoDestinoMensajeCcRepository;
	private final MensajeGrillaRepository mensajeGrillaRepository;
	private final MensajeGrillaCcRepository mensajeGrillaCcRepository;
	private final MensajeDocComunAdjuntoRepository mensajeDocComunAdjuntoRepository;

	public CrearProcesoRequestFixture(ObjectMapper mapper, ProcessRepository processRepository,
			PermisoProcesoRepository permisoProcesoRepository, PermisoRolProcesoRepository permisoRolProcesoRepository,
			PermisoGrupoProcesoRepository permisoGrupoProcesoRepository,
			RolGenericoProcesoRepository rolGenericoProcesoRepository,
			DocumentoComunProcesoRepository documentoComunProcesoRepository,
			PermisoUsuarioDocComunRepository permisoUsuarioDocComunRepository,
			PermisoRolDocComunRepository permisoRolDocComunRepository,
			PermisoGrupoDocComunRepository permisoGrupoDocComunRepository,
			ResponsableProcesoRepository responsableProcesoRepository,
			CondicionVisibilidadProcesoRepository condicionVisibilidadProcesoRepository,
			PermisoProcesoCondicionRepository permisoProcesoCondicionRepository,
			ProcesoMecanismoDenominacionRepository procesoMecanismoDenominacionRepository,
			DatoReqProcesoRepository datoReqProcesoRepository, MetadatoReqProcesoRepository metadatoReqProcesoRepository,
			ProcesoCatalogoRepository procesoCatalogoRepository, ActivityRepository activityRepository,
			RolGenericoActividadRepository rolGenericoActividadRepository,
			DocumentoComunActividadRepository documentoComunActividadRepository,
			MetaDisponiblesActividadRepository metaDisponiblesActividadRepository,
			ReglaDocumentoMultipleRepository reglaDocumentoMultipleRepository,
			MetadatoTransferidoActividadRepository metadatoTransferidoActividadRepository,
			ElementosRequeridosRepository elementosRequeridosRepository,
			UsuariosPreAsignadosRepository usuariosPreAsignadosRepository,
			RolesPreAsignadosRepository rolesPreAsignadosRepository,
			ActivitiesSubProcesoRepository activitiesSubProcesoRepository,
			RegistroExternoActivityRepository registroExternoActivityRepository,
			ClaveRegistroExternoRepository claveRegistroExternoRepository,
			ActivityClaveRegExternoRepository activityClaveRegExternoRepository,
			TimerProcesoRepository timerProcesoRepository,
			ActivityTimerProcesoRepository activityTimerProcesoRepository,
			TransitionRepository transitionRepository,
			TransitionTimerProcesoRepository transitionTimerProcesoRepository,
			ReglaUsuarioRepository reglaUsuarioRepository,
			TransitionReglaUsuarioRepository transitionReglaUsuarioRepository,
			OperandoReglaRepository operandoReglaRepository,
			OperandoReglaDocumentoRepository operandoReglaDocumentoRepository,
			ReglaDeNegocioRepository reglaDeNegocioRepository,
			TransitionReglaNegocioRepository transitionReglaNegocioRepository,
			MensajeRepository mensajeRepository,
			UsuarioMensajeRepository usuarioMensajeRepository,
			RolMensajeRepository rolMensajeRepository,
			MensajeDocumentoRepository mensajeDocumentoRepository,
			MetadatoDestinoMensajeRepository metadatoDestinoMensajeRepository,
			MetadatoDestinoMensajeCcRepository metadatoDestinoMensajeCcRepository,
			MensajeGrillaRepository mensajeGrillaRepository,
			MensajeGrillaCcRepository mensajeGrillaCcRepository,
			MensajeDocComunAdjuntoRepository mensajeDocComunAdjuntoRepository) {
		this.mapper = mapper;
		this.processRepository = processRepository;
		this.permisoProcesoRepository = permisoProcesoRepository;
		this.permisoRolProcesoRepository = permisoRolProcesoRepository;
		this.permisoGrupoProcesoRepository = permisoGrupoProcesoRepository;
		this.rolGenericoProcesoRepository = rolGenericoProcesoRepository;
		this.documentoComunProcesoRepository = documentoComunProcesoRepository;
		this.permisoUsuarioDocComunRepository = permisoUsuarioDocComunRepository;
		this.permisoRolDocComunRepository = permisoRolDocComunRepository;
		this.permisoGrupoDocComunRepository = permisoGrupoDocComunRepository;
		this.responsableProcesoRepository = responsableProcesoRepository;
		this.condicionVisibilidadProcesoRepository = condicionVisibilidadProcesoRepository;
		this.permisoProcesoCondicionRepository = permisoProcesoCondicionRepository;
		this.procesoMecanismoDenominacionRepository = procesoMecanismoDenominacionRepository;
		this.datoReqProcesoRepository = datoReqProcesoRepository;
		this.metadatoReqProcesoRepository = metadatoReqProcesoRepository;
		this.procesoCatalogoRepository = procesoCatalogoRepository;
		this.activityRepository = activityRepository;
		this.rolGenericoActividadRepository = rolGenericoActividadRepository;
		this.documentoComunActividadRepository = documentoComunActividadRepository;
		this.metaDisponiblesActividadRepository = metaDisponiblesActividadRepository;
		this.reglaDocumentoMultipleRepository = reglaDocumentoMultipleRepository;
		this.metadatoTransferidoActividadRepository = metadatoTransferidoActividadRepository;
		this.elementosRequeridosRepository = elementosRequeridosRepository;
		this.usuariosPreAsignadosRepository = usuariosPreAsignadosRepository;
		this.rolesPreAsignadosRepository = rolesPreAsignadosRepository;
		this.activitiesSubProcesoRepository = activitiesSubProcesoRepository;
		this.registroExternoActivityRepository = registroExternoActivityRepository;
		this.claveRegistroExternoRepository = claveRegistroExternoRepository;
		this.activityClaveRegExternoRepository = activityClaveRegExternoRepository;
		this.timerProcesoRepository = timerProcesoRepository;
		this.activityTimerProcesoRepository = activityTimerProcesoRepository;
		this.transitionRepository = transitionRepository;
		this.transitionTimerProcesoRepository = transitionTimerProcesoRepository;
		this.reglaUsuarioRepository = reglaUsuarioRepository;
		this.transitionReglaUsuarioRepository = transitionReglaUsuarioRepository;
		this.operandoReglaRepository = operandoReglaRepository;
		this.operandoReglaDocumentoRepository = operandoReglaDocumentoRepository;
		this.reglaDeNegocioRepository = reglaDeNegocioRepository;
		this.transitionReglaNegocioRepository = transitionReglaNegocioRepository;
		this.mensajeRepository = mensajeRepository;
		this.usuarioMensajeRepository = usuarioMensajeRepository;
		this.rolMensajeRepository = rolMensajeRepository;
		this.mensajeDocumentoRepository = mensajeDocumentoRepository;
		this.metadatoDestinoMensajeRepository = metadatoDestinoMensajeRepository;
		this.metadatoDestinoMensajeCcRepository = metadatoDestinoMensajeCcRepository;
		this.mensajeGrillaRepository = mensajeGrillaRepository;
		this.mensajeGrillaCcRepository = mensajeGrillaCcRepository;
		this.mensajeDocComunAdjuntoRepository = mensajeDocComunAdjuntoRepository;
	}

	public CrearProcesoRequest buildFrom(int procesoOrigenId, String nuevoNombre) {
		WorkflowProcess origen = processRepository.findById(procesoOrigenId)
				.orElseThrow(() -> new IllegalStateException("Proceso base " + procesoOrigenId + " no existe"));

		CrearProcesoRequest request = new CrearProcesoRequest();
		request.setProceso(copiarProceso(origen, nuevoNombre));
		request.setPermisosUsuarios(permisosUsuarios(procesoOrigenId));
		request.setPermisosRoles(permisosRoles(procesoOrigenId));
		request.setPermisosGrupos(permisosGrupos(procesoOrigenId));
		request.setRolesGenericosProceso(rolesGenericosProceso(procesoOrigenId));

		Map<Integer, String> docNombres = new HashMap<>();
		request.setDocumentosComunes(documentosComunes(procesoOrigenId, docNombres));
		request.setCargosResponsables(responsables(procesoOrigenId, docNombres));
		request.setProcesoMecanismo(mecanismo(procesoOrigenId, docNombres));
		request.setActividades(actividades(procesoOrigenId, docNombres));
		request.setTransiciones(transiciones(procesoOrigenId, docNombres));
		catalogo(procesoOrigenId, request);
		return request;
	}

	private <T> T copy(Object source, Class<T> type) {
		return mapper.convertValue(source, type);
	}

	private WorkflowProcess copiarProceso(WorkflowProcess origen, String nuevoNombre) {
		WorkflowProcess copia = copy(origen, WorkflowProcess.class);
		copia.setProcessId(null);
		copia.setProcessName(nuevoNombre);
		if (copia.getPath() != null) {
			copia.setPath(XmlDiagramaUtil.regenerarNombre(copia.getPath(), nuevoNombre));
		}
		return copia;
	}

	private List<String> permisosUsuarios(int processId) {
		return permisoProcesoRepository.findAll().stream()
				.filter(p -> p.getId().getProcessId().equals(processId))
				.map(p -> p.getId().getIdUsuario())
				.filter(Objects::nonNull)
				.toList();
	}

	private List<Integer> permisosRoles(int processId) {
		return permisoRolProcesoRepository.findAll().stream()
				.filter(p -> p.getId().getProcessId().equals(processId))
				.map(p -> p.getId().getIdRol())
				.filter(Objects::nonNull)
				.toList();
	}

	private List<Integer> permisosGrupos(int processId) {
		return permisoGrupoProcesoRepository.findAll().stream()
				.filter(p -> p.getId().getProcessId().equals(processId))
				.map(p -> p.getId().getIdGrupo())
				.filter(Objects::nonNull)
				.toList();
	}

	private List<RolGenericoProcesoRequest> rolesGenericosProceso(int processId) {
		Map<Integer, List<Integer>> agrupados = new LinkedHashMap<>();
		for (RolGenericoProceso rel : rolGenericoProcesoRepository.findAll()) {
			if (Objects.equals(rel.getId().getIdProceso(), processId)) {
				agrupados.computeIfAbsent(rel.getId().getIdRolGenerico(), k -> new ArrayList<>())
						.add(rel.getId().getIdRol());
			}
		}
		return agrupados.entrySet().stream().map(e -> {
			RolGenericoProcesoRequest req = new RolGenericoProcesoRequest();
			req.setIdRolGenerico(e.getKey());
			req.setRolesAsociados(e.getValue());
			return req;
		}).toList();
	}

	private List<DocumentoComunPermisosRequest> documentosComunes(int processId, Map<Integer, String> docNombres) {
		List<DocumentoComunPermisosRequest> result = new ArrayList<>();
		for (DocumentoComunProceso doc : documentoComunProcesoRepository.findByProcessId(processId)) {
			DocumentoComunPermisosRequest req = new DocumentoComunPermisosRequest();
			DocumentoComunProceso copia = copy(doc, DocumentoComunProceso.class);
			copia.setDocComunId(null);
			copia.setProcessId(null);
			req.setDocumentoComunProceso(copia);

			Integer docComunId = doc.getDocComunId();
			docNombres.putIfAbsent(docComunId, doc.getNombreDocComun());

			req.setPermisosUsuarios(permisoUsuarioDocComunRepository.findAll().stream()
					.filter(p -> Objects.equals(p.getId().getDocComunId(), docComunId))
					.map(p -> p.getId().getIdUsuario())
					.filter(Objects::nonNull)
					.toList());
			req.setPermisosRoles(permisoRolDocComunRepository.findAll().stream()
					.filter(p -> Objects.equals(p.getId().getDocComunId(), docComunId))
					.map(p -> p.getId().getIdRol())
					.filter(Objects::nonNull)
					.toList());
			req.setPermisosGrupos(permisoGrupoDocComunRepository.findAll().stream()
					.filter(p -> Objects.equals(p.getId().getDocComunId(), docComunId))
					.map(p -> p.getId().getIdGrupo())
					.filter(Objects::nonNull)
					.toList());
			result.add(req);
		}
		return result;
	}

	private List<ResponsableProcesoRequest> responsables(int processId, Map<Integer, String> docNombres) {
		List<PermisoProcesoCondicion> condiciones = permisoProcesoCondicionRepository.findAll().stream()
				.filter(pc -> Objects.equals(pc.getId().getProcessId(), processId))
				.toList();

		List<ResponsableProcesoRequest> result = new ArrayList<>();
		for (ResponsableProceso rel : responsableProcesoRepository.findAll()) {
			if (!Objects.equals(rel.getId().getProcessId(), processId)) {
				continue;
			}
			Integer idRol = rel.getId().getIdRol();
			ResponsableProcesoRequest req = new ResponsableProcesoRequest();
			req.setIdRol(idRol);

			List<CondicionVisibilidadRequest> condicionesReq = new ArrayList<>();
			for (PermisoProcesoCondicion pc : condiciones) {
				if (!Objects.equals(pc.getId().getIdRol(), idRol)) {
					continue;
				}
				CondicionVisibilidadProceso origen = condicionVisibilidadProcesoRepository
						.findById(pc.getId().getIdCondicionProceso()).orElse(null);
				if (origen == null) {
					continue;
				}
				CondicionVisibilidadRequest cr = new CondicionVisibilidadRequest();
				Integer docIzq = origen.getDocComunIdIzq();
				if (docIzq != null && docNombres.containsKey(docIzq)) {
					cr.setNombreDocComun(docNombres.get(docIzq));
				}
				CondicionVisibilidadProceso cond = copy(origen, CondicionVisibilidadProceso.class);
				cond.setIdCondicionProceso(null);
				cond.setDocComunIdIzq(null);
				cr.setCondicion(cond);
				condicionesReq.add(cr);
			}
			req.setCondicionesVisibilidad(condicionesReq);
			result.add(req);
		}
		return result;
	}

	private DatoMecanismoRequest mecanismo(int processId, Map<Integer, String> docNombres) {
		ProcesoMecanismoDenominacion pm = procesoMecanismoDenominacionRepository.findAll().stream()
				.filter(m -> Objects.equals(m.getProcessId(), processId))
				.findFirst().orElse(null);
		if (pm == null) {
			return null;
		}
		DatoMecanismoRequest req = new DatoMecanismoRequest();
		req.setIdMecanismoDenominacion(pm.getIdMecanismoDenominacion());

		List<DatoReqProcesoRequest> datos = new ArrayList<>();
		for (DatoReqProceso dato : datoReqProcesoRepository.findAll()) {
			if (!Objects.equals(dato.getProcessId(), processId)) {
				continue;
			}
			DatoReqProcesoRequest dr = new DatoReqProcesoRequest();
			DatoReqProceso copiaDato = copy(dato, DatoReqProceso.class);
			copiaDato.setIdDatoReqProceso(null);
			copiaDato.setProcessId(null);
			dr.setDato(copiaDato);

			Integer idDatoReq = dato.getIdDatoReqProceso();
			MetadatoReqProceso md = metadatoReqProcesoRepository.findAll().stream()
					.filter(m -> Objects.equals(m.getIdDatoReqProceso(), idDatoReq))
					.findFirst().orElse(null);
			if (md != null) {
				MetadatoReqProceso copiaMd = copy(md, MetadatoReqProceso.class);
				copiaMd.setIdDatoReqProceso(null);
				Integer docComun = md.getDocComunId();
				if (docComun != null && docNombres.containsKey(docComun)) {
					dr.setNombreDocumentoComun(docNombres.get(docComun));
				}
				copiaMd.setDocComunId(null);
				dr.setMetadatoRequerido(copiaMd);
			}
			datos.add(dr);
		}
		req.setDatosRequeridos(datos);
		return req;
	}

	private List<ActividadRequest> actividades(int processId, Map<Integer, String> docNombres) {
		List<ActividadRequest> result = new ArrayList<>();
		for (Activity origen : activityRepository.findByProcessId(processId)) {
			ActividadRequest req = new ActividadRequest();
			Integer activityId = origen.getActivityId();

			Activity copia = copy(origen, Activity.class);
			copia.setActivityId(null);
			copia.setProcessId(null);
			req.setActividad(copia);

			req.setRolesGenericos(rolGenericoActividadRepository.findAll().stream()
					.filter(r -> Objects.equals(r.getId().getIdActividad(), activityId))
					.map(r -> {
						RolGenericoActividadRequest rr = new RolGenericoActividadRequest();
						rr.setIdRolGenerico(r.getId().getIdRolGenerico());
						rr.setIdProcesoCargoGenerico(r.getId().getProcessId());
						return rr;
					})
					.toList());

			req.setUsuariosPreAsignados(usuariosPreAsignadosRepository.findByIdActivityId(activityId).stream()
					.map(u -> {
						UsuarioPreAsignadoRequest uu = new UsuarioPreAsignadoRequest();
						uu.setIdUsuario(u.getId().getIdUsuario());
						uu.setIdProcedencia(u.getId().getIdProcedencia());
						return uu;
					})
					.toList());

			req.setRolesPreAsignados(rolesPreAsignadosRepository.findByIdActivityId(activityId).stream()
					.map(r -> r.getId().getIdRol())
					.filter(Objects::nonNull)
					.toList());

			req.setDocumentosComunesActividad(documentosComunesActividad(activityId, docNombres));

			req.setElementosRequeridos(elementosRequeridosRepository.findByIdActivityId(activityId).stream()
					.map(e -> {
						ElementosRequeridosRequest ee = new ElementosRequeridosRequest();
						ee.setIdElemento(e.getId().getIdElemento());
						ee.setIdTipoElementoRequerido(e.getIdTipoElementoRequerido());
						return ee;
					})
					.toList());

			activitiesSubProcesoRepository.findByIdActivityId(activityId).stream().findFirst()
					.ifPresent(sp -> req.setIdSubProceso(sp.getId().getProcessId()));

			registroExternoActivityRepository.findAll().stream()
					.filter(re -> Objects.equals(re.getActivityId(), activityId))
					.findFirst()
					.ifPresent(re -> req.setRegistroExterno(registroExterno(re)));

			activityTimerProcesoRepository.findByIdActivityId(activityId).stream().findFirst()
					.ifPresent(atp -> {
						TimerProceso timer = timerProcesoRepository
								.findById(atp.getId().getIdTimerProceso()).orElse(null);
						if (timer != null) {
							req.setTimer(copiarTimer(timer, docNombres));
						}
					});

			mensajeRepository.findFirstByActivityId(activityId)
					.ifPresent(m -> req.setMensaje(mensajeActividad(m, docNombres)));

			result.add(req);
		}
		return result;
	}

	private List<DocumentoComunActividadRequest> documentosComunesActividad(int activityId,
			Map<Integer, String> docNombres) {
		List<DocumentoComunActividadRequest> result = new ArrayList<>();
		for (DocumentoComunActividad dca : documentoComunActividadRepository.findByIdActivityId(activityId)) {
			DocumentoComunActividadRequest req = new DocumentoComunActividadRequest();
			Integer docComunId = dca.getId().getDocComunId();
			req.setNombreDocComunProceso(docNombres.get(docComunId));

			DocumentoComunActividad copia = copy(dca, DocumentoComunActividad.class);
			copia.setId(new DocumentoComunActividadId(null, null));
			req.setDocumentoComunActividad(copia);

			req.setMetadatosDisponibles(metaDisponiblesActividadRepository.findByIdActivityId(activityId).stream()
					.filter(m -> Objects.equals(m.getId().getDocComunId(), docComunId))
					.map(this::copiarMetaDisponible)
					.toList());

			reglaDocumentoMultipleRepository.findByIdActivityId(activityId).stream()
					.filter(r -> Objects.equals(r.getId().getDocComunId(), docComunId))
					.findFirst()
					.ifPresent(r -> req.setReglaMultiFormulario(copiarReglaMultiFormulario(r, docNombres)));

			req.setMetadatosTransferidos(metadatoTransferidoActividadRepository.findByActivityId(activityId).stream()
					.filter(m -> Objects.equals(m.getDocComunIdDestino(), docComunId))
					.map(m -> copiarMetadatoTransferido(m, docNombres))
					.toList());

			result.add(req);
		}
		return result;
	}

	private MetaDisponiblesActividad copiarMetaDisponible(MetaDisponiblesActividad origen) {
		MetaDisponiblesActividad copia = copy(origen, MetaDisponiblesActividad.class);
		MetaDisponiblesActividadId id = copia.getId();
		if (id == null) {
			id = new MetaDisponiblesActividadId();
		}
		copia.setId(new MetaDisponiblesActividadId(null, null, id.getIdDocumento(), id.getIdMetadato(), id.getIdBloque()));
		return copia;
	}

	private ReglaDocumentoMultiple copiarReglaMultiFormulario(ReglaDocumentoMultiple origen,
			Map<Integer, String> docNombres) {
		ReglaDocumentoMultiple copia = copy(origen, ReglaDocumentoMultiple.class);
		ReglaDocumentoMultipleId id = copia.getId();
		if (id == null) {
			id = new ReglaDocumentoMultipleId();
		}
		Integer docComunIdRegla = id.getDocComunIdRegla();
		String nombreDocComunRegla = docNombres.get(docComunIdRegla);
		if (nombreDocComunRegla != null) {
			copia.setNombreDocComunRegla(nombreDocComunRegla);
		}
		copia.setId(new ReglaDocumentoMultipleId(null, null,
				nombreDocComunRegla != null ? null : 0,
				id.getIdDocumento(), id.getIdMetadato(), id.getIdBloque()));
		return copia;
	}

	private MetadatoTransferidoActividad copiarMetadatoTransferido(MetadatoTransferidoActividad origen,
			Map<Integer, String> docNombres) {
		MetadatoTransferidoActividad copia = copy(origen, MetadatoTransferidoActividad.class);
		copia.setMetadatoTransferidoId(null);
		copia.setActivityId(null);
		copia.setDocComunIdDestino(null);
		Integer docOrigen = origen.getDocComunIdOrigen();
		if (docOrigen != null && docNombres.containsKey(docOrigen)) {
			copia.setNombreDocComunOrigen(docNombres.get(docOrigen));
		}
		copia.setDocComunIdOrigen(null);
		return copia;
	}

	private RegistroExternoRequest registroExterno(RegistroExternoActivity origen) {
		RegistroExternoRequest req = new RegistroExternoRequest();
		RegistroExternoActivity copia = copy(origen, RegistroExternoActivity.class);
		copia.setActivityId(null);
		copia.setProcessId(null);
		copia.setDocComunId(null);
		req.setRegistroExterno(copia);

		Map<Integer, ClaveRegistroExterno> claves = new HashMap<>();
		for (ClaveRegistroExterno clave : claveRegistroExternoRepository.findAll()) {
			claves.put(clave.getIdClaveRegistroExterno(), clave);
		}
		req.setClaves(activityClaveRegExternoRepository.findByIdActivityId(origen.getActivityId()).stream()
				.map(rel -> claves.get(rel.getId().getIdClaveRegistroExterno()))
				.filter(Objects::nonNull)
				.map(clave -> {
					ClaveRegistroExterno copiaClave = copy(clave, ClaveRegistroExterno.class);
					copiaClave.setIdClaveRegistroExterno(null);
					return copiaClave;
				})
				.toList());
		return req;
	}

	private MensajeActividadRequest mensajeActividad(Mensaje origen, Map<Integer, String> docNombres) {
		MensajeActividadRequest req = new MensajeActividadRequest();
		req.setAsunto(origen.getAsunto());
		req.setContenido(origen.getContenido());
		req.setEncabezado(origen.getEncabezado());
		req.setCc(origen.getConCopia());
		req.setEnviaACargo(origen.getEnviaACargo());
		req.setEnviaFormularioExterno(origen.getEnviaFormularioExterno());

		Integer idMensaje = origen.getIdMensaje();
		req.setUsuariosSistema(destinatarios(idMensaje, true, false));
		req.setUsuariosSistemaCc(destinatarios(idMensaje, true, true));
		req.setUsuariosExternos(destinatarios(idMensaje, false, false));
		req.setUsuariosExternosCc(destinatarios(idMensaje, false, true));

		req.setRolesSistema(rolMensajeRepository.findByIdIdMensaje(idMensaje).stream()
				.map(r -> r.getId().getIdRol())
				.toList());

		req.setDocumentosFormulario(mensajeDocumentoRepository.findByIdIdMensaje(idMensaje).stream()
				.map(d -> {
					MensajeDocumentoRequest dr = new MensajeDocumentoRequest();
					dr.setIdDocumento(d.getId().getIdDocumento());
					dr.setMinimoRespuestas(d.getMinimoRespuestas());
					return dr;
				})
				.toList());

		req.setDestinatariosMetadato(destinatariosMetadato(
				metadatoDestinoMensajeRepository.findByIdMensaje(idMensaje), false, docNombres));
		req.setDestinatariosMetadatoCc(destinatariosMetadatoCc(
				metadatoDestinoMensajeCcRepository.findByIdMensaje(idMensaje), docNombres));

		req.setDocumentosAdjuntos(mensajeDocComunAdjuntoRepository.findByIdIdMensaje(idMensaje).stream()
				.map(a -> a.getId().getNombreDocumentoComun())
				.toList());
		return req;
	}

	private List<String> destinatarios(int idMensaje, boolean usuarioSistema, boolean copia) {
		return usuarioMensajeRepository.findByIdIdMensaje(idMensaje).stream()
				.filter(u -> Objects.equals(u.getUsuarioSistema(), usuarioSistema)
						&& Objects.equals(u.getCopia(), copia))
				.map(u -> u.getId().getDestinatario())
				.toList();
	}

	private List<DestinatarioMetadatoRequest> destinatariosMetadato(List<MetadatoDestinoMensaje> origenes,
			boolean esGrilla, Map<Integer, String> docNombres) {
		return origenes.stream()
				.filter(d -> Objects.equals(d.getEsGrilla(), esGrilla))
				.map(d -> {
					DestinatarioMetadatoRequest dr = new DestinatarioMetadatoRequest();
					dr.setNombreDocComun(docNombres.get(d.getDocComunId()));
					dr.setIdMetadato(d.getIdMetadato());
					dr.setIdBloque(d.getIdBloque());
					dr.setCodigoBloque(d.getCodigoBloque());
					dr.setEsGrilla(esGrilla);
					dr.setColumnasGrilla(esGrilla
							? mensajeGrillaRepository.findByIdMetadatoDestMensaje(d.getIdMetadatoDest()).stream()
									.map(this::copiarColumnaGrilla)
									.toList()
							: null);
					return dr;
				})
				.toList();
	}

	private List<DestinatarioMetadatoRequest> destinatariosMetadatoCc(List<MetadatoDestinoMensajeCc> origenes,
			Map<Integer, String> docNombres) {
		return origenes.stream()
				.map(d -> {
					boolean esGrilla = Boolean.TRUE.equals(d.getEsGrilla());
					DestinatarioMetadatoRequest dr = new DestinatarioMetadatoRequest();
					dr.setNombreDocComun(docNombres.get(d.getDocComunId()));
					dr.setIdMetadato(d.getIdMetadato());
					dr.setIdBloque(d.getIdBloque());
					dr.setCodigoBloque(d.getCodigoBloque());
					dr.setEsGrilla(esGrilla);
					dr.setColumnasGrilla(esGrilla
							? mensajeGrillaCcRepository.findByIdMetadatoDestCc(d.getIdMetadatoDestCc()).stream()
									.map(this::copiarColumnaGrillaCc)
									.toList()
							: null);
					return dr;
				})
				.toList();
	}

	private ColumnaGrillaMensajeRequest copiarColumnaGrilla(MensajeGrilla origen) {
		ColumnaGrillaMensajeRequest c = new ColumnaGrillaMensajeRequest();
		c.setIdGrillaMetadato(origen.getIdGrillaMetadato());
		c.setIdColumnaGrilla(origen.getIdColumnaGrilla());
		c.setDatafield(origen.getDatafield());
		return c;
	}

	private ColumnaGrillaMensajeRequest copiarColumnaGrillaCc(MensajeGrillaCc origen) {
		ColumnaGrillaMensajeRequest c = new ColumnaGrillaMensajeRequest();
		c.setIdGrillaMetadato(origen.getIdGrillaMetadato());
		c.setIdColumnaGrilla(origen.getIdColumnaGrilla());
		c.setDatafield(origen.getDatafield());
		return c;
	}

	private TimerProceso copiarTimer(TimerProceso origen, Map<Integer, String> docNombres) {
		TimerProceso copia = copy(origen, TimerProceso.class);
		copia.setIdTimerProceso(null);
		Integer docComunId = origen.getDocComunId();
		if (docComunId == null || docComunId <= 0) {
			copia.setNombreDocComun(null);
			return copia;
		}
		String nombre = docNombres.get(docComunId);
		if (nombre != null) {
			copia.setNombreDocComun(nombre);
			copia.setDocComunId(null);
			if (!Boolean.TRUE.equals(copia.getEsMetFormulario())) {
				copia.setEsMetFormulario(Boolean.TRUE);
			}
		} else {
			copia.setNombreDocComun(null);
			copia.setDocComunId(null);
		}
		return copia;
	}

	private List<TransicionRequest> transiciones(int processId, Map<Integer, String> docNombres) {
		Map<Integer, String> activityIdAElemento = new HashMap<>();
		for (Activity actividad : activityRepository.findByProcessId(processId)) {
			activityIdAElemento.put(actividad.getActivityId(), actividad.getIdElemento());
		}

		List<TransicionRequest> result = new ArrayList<>();
		for (Transition origen : transitionRepository.findByProcessId(processId)) {
			TransicionRequest req = new TransicionRequest();
			Integer transitionId = origen.getTransitionId();

			Transition copia = copy(origen, Transition.class);
			copia.setTransitionId(null);
			copia.setActivityIdSource(null);
			copia.setActivityIdDestination(null);
			copia.setProcessId(null);
			req.setTransicion(copia);
			req.setIdActividadOrigen(activityIdAElemento.get(origen.getActivityIdSource()));
			req.setIdActividadDestino(activityIdAElemento.get(origen.getActivityIdDestination()));

			req.setReglasUsuario(transitionReglaUsuarioRepository.findByIdTransitionId(transitionId).stream()
					.map(rel -> rel.getId().getIdReglaUsuario())
					.map(id -> reglaUsuarioRepository.findById(id).orElse(null))
					.filter(Objects::nonNull)
					.map(regla -> copiarReglaUsuario(regla, docNombres))
					.toList());

			req.setReglasNegocio(transitionReglaNegocioRepository.findByIdTransitionId(transitionId).stream()
					.map(rel -> rel.getId().getIdReglaNegocio())
					.map(id -> reglaDeNegocioRepository.findById(id).orElse(null))
					.filter(Objects::nonNull)
					.map(regla -> reglaNegocio(regla, docNombres))
					.toList());

			transitionTimerProcesoRepository.findByIdTransitionId(transitionId).stream().findFirst()
					.ifPresent(ttp -> {
						TimerProceso timer = timerProcesoRepository
								.findById(ttp.getId().getIdTimerProceso()).orElse(null);
						if (timer != null) {
							req.setTieneTimer(Boolean.TRUE);
							req.setTimer(copiarTimer(timer, docNombres));
							req.setConInterrupcion(ttp.getConInterrupcion());
						}
					});

			result.add(req);
		}
		return result;
	}

	private ReglaUsuario copiarReglaUsuario(ReglaUsuario origen, Map<Integer, String> docNombres) {
		ReglaUsuario copia = copy(origen, ReglaUsuario.class);
		copia.setIdReglaUsuario(null);
		Integer docComunId = origen.getIdDocIzq();
		if (docComunId != null && docNombres.containsKey(docComunId)) {
			copia.setNombreDocComun(docNombres.get(docComunId));
		}
		copia.setIdDocIzq(null);
		return copia;
	}

	private ReglaNegocioRequest reglaNegocio(ReglaDeNegocio origen, Map<Integer, String> docNombres) {
		ReglaNegocioRequest req = new ReglaNegocioRequest();
		req.setIdOperadorRegla(origen.getIdOperadorRegla());
		req.setOperandoIzq(operando(operandoReglaRepository.findById(origen.getIdOperandoIzq()).orElse(null), docNombres));
		req.setOperandoDer(operando(operandoReglaRepository.findById(origen.getIdOperandoDer()).orElse(null), docNombres));
		return req;
	}

	private OperandoReglaRequest operando(OperandoRegla origen, Map<Integer, String> docNombres) {
		OperandoReglaRequest req = new OperandoReglaRequest();
		if (origen == null) {
			return req;
		}
		req.setValorOperando(origen.getValorOperando());
		req.setEsDoc(origen.getEsDoc());
		if (Boolean.TRUE.equals(origen.getEsDoc())) {
			OperandoReglaDocumento detalle = operandoReglaDocumentoRepository.findAll().stream()
					.filter(d -> Objects.equals(d.getIdOperandoRegla(), origen.getIdOperandoRegla()))
					.findFirst().orElse(null);
			if (detalle != null) {
				Integer docComunId = detalle.getDocComunId();
				req.setNombreDocComun(docComunId != null ? docNombres.get(docComunId) : null);
				req.setIdBloque(detalle.getIdBloque());
				req.setCodigoBloque(detalle.getCodigoBloque());
				req.setIdMetadato(detalle.getIdMetadato());
				req.setIdTipoDato(detalle.getIdTipoDato());
			}
		}
		return req;
	}

	private void catalogo(int processId, CrearProcesoRequest request) {
		List<ProcesoCatalogo> catalogo = procesoCatalogoRepository.findAll().stream()
				.filter(c -> Objects.equals(c.getId().getProcessId(), processId))
				.toList();
		if (catalogo.isEmpty()) {
			return;
		}
		request.setPublicaEnCatalogo(true);
		request.setIdDocumentoPublicar(catalogo.get(0).getIdDocumento());
		request.setCatalogos(catalogo.stream().map(c -> c.getId().getIdCatalogo()).toList());
	}
}