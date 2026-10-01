package com.example.workflowapp.service;

import com.example.workflowapp.exception.BusinessException;
import com.example.workflowapp.model.ActividadRequest;
import com.example.workflowapp.model.ActivitiesSubProceso;
import com.example.workflowapp.model.ActivitiesSubProcesoId;
import com.example.workflowapp.model.Activity;
import com.example.workflowapp.model.ActivityClaveRegExterno;
import com.example.workflowapp.model.ActivityClaveRegExternoId;
import com.example.workflowapp.model.ActivityTimerProceso;
import com.example.workflowapp.model.ActivityTimerProcesoId;
import com.example.workflowapp.model.CondicionVisibilidadRequest;
import com.example.workflowapp.model.CondicionVisibilidadProceso;
import com.example.workflowapp.model.ColumnaGrillaMensajeRequest;
import com.example.workflowapp.model.CrearProcesoRequest;
import com.example.workflowapp.model.DatoMecanismoRequest;
import com.example.workflowapp.model.DatoReqProceso;
import com.example.workflowapp.model.DatoReqProcesoRequest;
import com.example.workflowapp.model.DestinatarioMetadatoRequest;
import com.example.workflowapp.model.DocumentoComunActividad;
import com.example.workflowapp.model.DocumentoComunActividadId;
import com.example.workflowapp.model.DocumentoComunActividadRequest;
import com.example.workflowapp.model.DocumentoComunPermisosRequest;
import com.example.workflowapp.model.DocumentoComunProceso;
import com.example.workflowapp.model.ElementosRequeridos;
import com.example.workflowapp.model.ElementosRequeridosId;
import com.example.workflowapp.model.ElementosRequeridosRequest;
import com.example.workflowapp.model.MetaDisponiblesActividad;
import com.example.workflowapp.model.MetaDisponiblesActividadId;
import com.example.workflowapp.model.Mensaje;
import com.example.workflowapp.model.MensajeActividadRequest;
import com.example.workflowapp.model.MensajeDocComunAdjunto;
import com.example.workflowapp.model.MensajeDocComunAdjuntoId;
import com.example.workflowapp.model.MensajeDocumento;
import com.example.workflowapp.model.MensajeDocumentoId;
import com.example.workflowapp.model.MensajeDocumentoRequest;
import com.example.workflowapp.model.MensajeGrilla;
import com.example.workflowapp.model.MensajeGrillaCc;
import com.example.workflowapp.model.MetadatoDestinoMensaje;
import com.example.workflowapp.model.MetadatoDestinoMensajeCc;
import com.example.workflowapp.model.MetadatoReqProceso;
import com.example.workflowapp.model.MetadatoTransferidoActividad;
import com.example.workflowapp.model.OperandoRegla;
import com.example.workflowapp.model.OperandoReglaDocumento;
import com.example.workflowapp.model.OperandoReglaRequest;
import com.example.workflowapp.model.PermisoGrupoDocComun;
import com.example.workflowapp.model.PermisoGrupoDocComunId;
import com.example.workflowapp.model.PermisoGrupoProceso;
import com.example.workflowapp.model.PermisoGrupoProcesoId;
import com.example.workflowapp.model.PermisoProceso;
import com.example.workflowapp.model.PermisoProcesoCondicion;
import com.example.workflowapp.model.PermisoProcesoCondicionId;
import com.example.workflowapp.model.PermisoProcesoId;
import com.example.workflowapp.model.PermisoRolDocComun;
import com.example.workflowapp.model.PermisoRolDocComunId;
import com.example.workflowapp.model.PermisoRolProceso;
import com.example.workflowapp.model.PermisoRolProcesoId;
import com.example.workflowapp.model.PermisoUsuarioDocComun;
import com.example.workflowapp.model.PermisoUsuarioDocComunId;
import com.example.workflowapp.model.ProcesoCatalogo;
import com.example.workflowapp.model.ProcesoCatalogoId;
import com.example.workflowapp.model.ProcesoMecanismoDenominacion;
import com.example.workflowapp.model.RegistroExternoRequest;
import com.example.workflowapp.model.RegistroExternoActivity;
import com.example.workflowapp.model.ReglaDeNegocio;
import com.example.workflowapp.model.ReglaDocumentoMultiple;
import com.example.workflowapp.model.ReglaDocumentoMultipleId;
import com.example.workflowapp.model.ReglaNegocioRequest;
import com.example.workflowapp.model.ReglaUsuario;
import com.example.workflowapp.model.ResponsableProceso;
import com.example.workflowapp.model.ResponsableProcesoId;
import com.example.workflowapp.model.ResponsableProcesoRequest;
import com.example.workflowapp.model.RolGenericoActividad;
import com.example.workflowapp.model.RolGenericoActividadId;
import com.example.workflowapp.model.RolGenericoActividadRequest;
import com.example.workflowapp.model.RolGenericoProceso;
import com.example.workflowapp.model.RolGenericoProcesoId;
import com.example.workflowapp.model.RolGenericoProcesoRequest;
import com.example.workflowapp.model.RolMensaje;
import com.example.workflowapp.model.RolMensajeId;
import com.example.workflowapp.model.RolesPreAsignados;
import com.example.workflowapp.model.RolesPreAsignadosId;
import com.example.workflowapp.model.TimerProceso;
import com.example.workflowapp.model.TransicionRequest;
import com.example.workflowapp.model.Transition;
import com.example.workflowapp.model.TransitionReglaNegocio;
import com.example.workflowapp.model.TransitionReglaNegocioId;
import com.example.workflowapp.model.TransitionReglaUsuario;
import com.example.workflowapp.model.TransitionReglaUsuarioId;
import com.example.workflowapp.model.TransitionTimerProceso;
import com.example.workflowapp.model.TransitionTimerProcesoId;
import com.example.workflowapp.model.UsuarioPreAsignadoRequest;
import com.example.workflowapp.model.UsuarioMensaje;
import com.example.workflowapp.model.UsuarioMensajeId;
import com.example.workflowapp.model.UsuariosPreAsignados;
import com.example.workflowapp.model.UsuariosPreAsignadosId;
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
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProcesoCreadorService {

	private static final String TIPO_INICIO = "inicio";
	private static final String TIPO_SUBPROCESO = "subProceso";
	private static final String SECUENCIA_PREFIX = "secuencia_proceso_mecanismov2_";

	private static final String CODIGO_NOMBRE_DUPLICADO = "PROCESO_NOMBRE_DUPLICADO";
	private static final String CODIGO_REGLAS_NEGOCIO = "ERROR_REGLAS_NEGOCIO";
	private static final String CODIGO_MECANISMO = "ERROR_MECANISMO_DENOMINACION";
	private static final String CODIGO_TRASVASIJE = "ERROR_TRASVASIJE";
	private static final String CODIGO_METADATO_ACTIVIDAD = "ERROR_METADATO_DISP_ACTIVIDAD";
	private static final String CODIGO_REGISTRO_EXTERNO = "ERROR_REGISTRO_EXTERNO_PROCESO";
	private static final String CODIGO_MENSAJE = "ERROR_MENSAJE_ACTIVIDAD";

	private static final String TIPO_MENSAJE = "mensaje";

	private final EntityManager em;
	private final ProcessRepository processRepository;
	private final ActivityRepository activityRepository;
	private final TransitionRepository transitionRepository;
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
	private final ProcesoMecanismoDenominacionRepository procesoMecanismoRepository;
	private final DatoReqProcesoRepository datoReqProcesoRepository;
	private final MetadatoReqProcesoRepository metadatoReqProcesoRepository;
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
	private final TransitionTimerProcesoRepository transitionTimerProcesoRepository;
	private final ReglaUsuarioRepository reglaUsuarioRepository;
	private final TransitionReglaUsuarioRepository transitionReglaUsuarioRepository;
	private final OperandoReglaRepository operandoReglaRepository;
	private final OperandoReglaDocumentoRepository operandoReglaDocumentoRepository;
	private final ReglaDeNegocioRepository reglaDeNegocioRepository;
	private final TransitionReglaNegocioRepository transitionReglaNegocioRepository;
	private final ProcesoCatalogoRepository procesoCatalogoRepository;
	private final MensajeRepository mensajeRepository;
	private final UsuarioMensajeRepository usuarioMensajeRepository;
	private final RolMensajeRepository rolMensajeRepository;
	private final MensajeDocumentoRepository mensajeDocumentoRepository;
	private final MetadatoDestinoMensajeRepository metadatoDestinoMensajeRepository;
	private final MetadatoDestinoMensajeCcRepository metadatoDestinoMensajeCcRepository;
	private final MensajeGrillaRepository mensajeGrillaRepository;
	private final MensajeGrillaCcRepository mensajeGrillaCcRepository;
	private final MensajeDocComunAdjuntoRepository mensajeDocComunAdjuntoRepository;

	public ProcesoCreadorService(EntityManager em, ProcessRepository processRepository,
			ActivityRepository activityRepository, TransitionRepository transitionRepository,
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
			ProcesoMecanismoDenominacionRepository procesoMecanismoRepository,
			DatoReqProcesoRepository datoReqProcesoRepository,
			MetadatoReqProcesoRepository metadatoReqProcesoRepository,
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
			TransitionTimerProcesoRepository transitionTimerProcesoRepository,
			ReglaUsuarioRepository reglaUsuarioRepository,
			TransitionReglaUsuarioRepository transitionReglaUsuarioRepository,
			OperandoReglaRepository operandoReglaRepository,
			OperandoReglaDocumentoRepository operandoReglaDocumentoRepository,
			ReglaDeNegocioRepository reglaDeNegocioRepository,
			TransitionReglaNegocioRepository transitionReglaNegocioRepository,
			ProcesoCatalogoRepository procesoCatalogoRepository,
			MensajeRepository mensajeRepository,
			UsuarioMensajeRepository usuarioMensajeRepository,
			RolMensajeRepository rolMensajeRepository,
			MensajeDocumentoRepository mensajeDocumentoRepository,
			MetadatoDestinoMensajeRepository metadatoDestinoMensajeRepository,
			MetadatoDestinoMensajeCcRepository metadatoDestinoMensajeCcRepository,
			MensajeGrillaRepository mensajeGrillaRepository,
			MensajeGrillaCcRepository mensajeGrillaCcRepository,
			MensajeDocComunAdjuntoRepository mensajeDocComunAdjuntoRepository) {
		this.em = em;
		this.processRepository = processRepository;
		this.activityRepository = activityRepository;
		this.transitionRepository = transitionRepository;
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
		this.procesoMecanismoRepository = procesoMecanismoRepository;
		this.datoReqProcesoRepository = datoReqProcesoRepository;
		this.metadatoReqProcesoRepository = metadatoReqProcesoRepository;
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
		this.transitionTimerProcesoRepository = transitionTimerProcesoRepository;
		this.reglaUsuarioRepository = reglaUsuarioRepository;
		this.transitionReglaUsuarioRepository = transitionReglaUsuarioRepository;
		this.operandoReglaRepository = operandoReglaRepository;
		this.operandoReglaDocumentoRepository = operandoReglaDocumentoRepository;
		this.reglaDeNegocioRepository = reglaDeNegocioRepository;
		this.transitionReglaNegocioRepository = transitionReglaNegocioRepository;
		this.procesoCatalogoRepository = procesoCatalogoRepository;
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

	/**
	 * Migrado desde cl.exceed.workFlow.facade.configuracion.FacadeAdvanceProcesos#addAdvanceProcesos
	 * (servicio Flex AdvAnceProcesosService#addAdvanceProcesos).
	 * Orden de persistencia id�ntico al legacy: proceso -> permisos compartidos -> roles gen�ricos ->
	 * documentos comunes (con mapa nombre->id) -> responsables/condiciones -> mecanismo de denominaci�n ->
	 * actividades -> transiciones -> publicaci�n en cat�logo.
	 */
	@Transactional
	public int crearProceso(CrearProcesoRequest request) {
		validarRequest(request);

		WorkflowProcess proceso = request.getProceso();

		if (processRepository.existsByProcessName(proceso.getProcessName())) {
			throw new BusinessException(HttpStatus.CONFLICT, CODIGO_NOMBRE_DUPLICADO,
					"Ya existe un proceso con el nombre \"" + proceso.getProcessName() + "\"");
		}

		proceso.setVersion(1);
		proceso.setIdPadre(-1);
		proceso.setEsUltimaVersion(true);

		Boolean esInstanciable = calcularEsInstanciable(request.getActividades(), request.getTransiciones());
		if (esInstanciable != null) {
			proceso.setEsInstanciable(esInstanciable);
		}

		proceso = processRepository.save(proceso);
		int processId = proceso.getProcessId();

		// La copia hereda el XML del proceso origen (name/processId del origen).
		// El motor legacy resuelve la definici�n por ese name/processId; sin regenerarlos
		// la copia colisiona con la definici�n original y no avanza al finalizar el flujo.
		if (StringUtils.hasText(proceso.getPath())) {
			proceso.setPath(XmlDiagramaUtil.regenerarDiagrama(proceso.getPath(), proceso.getProcessName(), processId));
			proceso = processRepository.save(proceso);
		}

		guardarPermisosProceso(request, processId);

		guardarRolesGenericosProceso(request.getRolesGenericosProceso(), processId);

		Map<String, Integer> mapaDocComun = guardarDocumentosComunesProceso(request.getDocumentosComunes(), processId);

		guardarResponsables(request.getCargosResponsables(), processId, mapaDocComun);

		guardarMecanismoDenominacion(request.getProcesoMecanismo(), processId, mapaDocComun);

		Map<String, Integer> actividadIdPorElemento = new HashMap<>();
		for (ActividadRequest actividadRequest : request.getActividades()) {
			Activity actividad = guardarActividad(actividadRequest, processId, mapaDocComun);
			actividadIdPorElemento.put(actividad.getIdElemento(), actividad.getActivityId());
		}

		for (TransicionRequest transicionRequest : request.getTransiciones()) {
			guardarTransicion(transicionRequest, processId, mapaDocComun, actividadIdPorElemento);
		}

		if (request.isPublicaEnCatalogo() && !request.getCatalogos().isEmpty() && request.getIdDocumentoPublicar() != -1) {
			guardarEnCatalogo(request, processId, actividadIdPorElemento);
		}

		return processId;
	}

	private void validarRequest(CrearProcesoRequest request) {
		if (request == null || request.getProceso() == null) {
			throw new BusinessException(HttpStatus.BAD_REQUEST, "DATOS_INCOMPLETOS",
					"Debe enviar el objeto \"proceso\" en la solicitud");
		}
		if (!StringUtils.hasText(request.getProceso().getProcessName())) {
			throw new BusinessException(HttpStatus.BAD_REQUEST, "DATOS_INCOMPLETOS",
					"El campo processName es obligatorio");
		}
	}

	private void guardarPermisosProceso(CrearProcesoRequest request, int processId) {
		for (String idUsuario : request.getPermisosUsuarios()) {
			PermisoProceso permiso = new PermisoProceso();
			permiso.setId(new PermisoProcesoId(processId, idUsuario));
			permisoProcesoRepository.save(permiso);
		}
		for (Integer idRol : request.getPermisosRoles()) {
			PermisoRolProceso permiso = new PermisoRolProceso();
			permiso.setId(new PermisoRolProcesoId(processId, idRol));
			permisoRolProcesoRepository.save(permiso);
		}
		for (Integer idGrupo : request.getPermisosGrupos()) {
			PermisoGrupoProceso permiso = new PermisoGrupoProceso();
			permiso.setId(new PermisoGrupoProcesoId(processId, idGrupo));
			permisoGrupoProcesoRepository.save(permiso);
		}
	}

	private void guardarRolesGenericosProceso(List<RolGenericoProcesoRequest> rolesGenericos, int processId) {
		for (RolGenericoProcesoRequest rolGenerico : rolesGenericos) {
			if (rolGenerico.getIdRolGenerico() == null) {
				continue;
			}
			for (Integer idRolAsociado : rolGenerico.getRolesAsociados()) {
				RolGenericoProceso rol = new RolGenericoProceso();
				rol.setId(new RolGenericoProcesoId(processId, rolGenerico.getIdRolGenerico(), idRolAsociado));
				rolGenericoProcesoRepository.save(rol);
			}
		}
	}

	private Map<String, Integer> guardarDocumentosComunesProceso(List<DocumentoComunPermisosRequest> documentos, int processId) {
		Map<String, Integer> mapa = new HashMap<>();
		for (DocumentoComunPermisosRequest docReq : documentos) {
			DocumentoComunProceso doc = docReq.getDocumentoComunProceso();
			if (doc == null || !StringUtils.hasText(doc.getNombreDocComun())) {
				throw new BusinessException(HttpStatus.BAD_REQUEST, "DATOS_INCOMPLETOS",
						"Documento com�n del proceso sin nombre (nombre_doc_comun)");
			}
			doc.setProcessId(processId);
			doc = documentoComunProcesoRepository.save(doc);
			int docComunId = doc.getDocComunId();

			if (!mapa.containsKey(doc.getNombreDocComun())) {
				mapa.put(doc.getNombreDocComun(), docComunId);
			}

			for (String idUsuario : docReq.getPermisosUsuarios()) {
				PermisoUsuarioDocComun permiso = new PermisoUsuarioDocComun();
				permiso.setId(new PermisoUsuarioDocComunId(docComunId, idUsuario));
				permisoUsuarioDocComunRepository.save(permiso);
			}
			for (Integer idRol : docReq.getPermisosRoles()) {
				PermisoRolDocComun permiso = new PermisoRolDocComun();
				permiso.setId(new PermisoRolDocComunId(docComunId, idRol));
				permisoRolDocComunRepository.save(permiso);
			}
			for (Integer idGrupo : docReq.getPermisosGrupos()) {
				PermisoGrupoDocComun permiso = new PermisoGrupoDocComun();
				permiso.setId(new PermisoGrupoDocComunId(docComunId, idGrupo));
				permisoGrupoDocComunRepository.save(permiso);
			}
		}
		return mapa;
	}

	private void guardarResponsables(List<ResponsableProcesoRequest> responsables, int processId, Map<String, Integer> mapaDocComun) {
		for (ResponsableProcesoRequest responsable : responsables) {
			if (responsable.getIdRol() == null) {
				continue;
			}
			ResponsableProceso rel = new ResponsableProceso();
			rel.setId(new ResponsableProcesoId(processId, responsable.getIdRol()));
			responsableProcesoRepository.save(rel);

			for (CondicionVisibilidadRequest condicionRequest : responsable.getCondicionesVisibilidad()) {
				CondicionVisibilidadProceso condicion = condicionRequest.getCondicion();
				if (condicion == null) {
					continue;
				}
				if (StringUtils.hasText(condicionRequest.getNombreDocComun())) {
					condicion.setDocComunIdIzq(mapaDocComun.getOrDefault(condicionRequest.getNombreDocComun(), -1));
				}
				condicion = condicionVisibilidadProcesoRepository.save(condicion);

				PermisoProcesoCondicion permiso = new PermisoProcesoCondicion();
				permiso.setId(new PermisoProcesoCondicionId(processId, responsable.getIdRol(),
						condicion.getIdCondicionProceso()));
				permisoProcesoCondicionRepository.save(permiso);
			}
		}
	}

	private void guardarMecanismoDenominacion(DatoMecanismoRequest mecanismoReq, int processId, Map<String, Integer> mapaDocComun) {
		Integer idMecanismo = mecanismoReq != null ? mecanismoReq.getIdMecanismoDenominacion() : null;
		if (idMecanismo == null || idMecanismo <= 0) {
			idMecanismo = obtenerMecanismoPorDefecto();
		}
		if (idMecanismo == null) {
			throw new BusinessException(HttpStatus.UNPROCESSABLE_ENTITY, CODIGO_MECANISMO,
					"No se pudo asignar el mecanismo de denominaci�n (no hay mecanismo por defecto)");
		}

		ProcesoMecanismoDenominacion procesoMecanismo = new ProcesoMecanismoDenominacion();
		procesoMecanismo.setProcessId(processId);
		procesoMecanismo.setIdMecanismoDenominacion(idMecanismo);
		procesoMecanismoRepository.save(procesoMecanismo);

		if (mecanismoReq == null) {
			return;
		}
		for (DatoReqProcesoRequest datoReq : mecanismoReq.getDatosRequeridos()) {
			DatoReqProceso dato = datoReq.getDato();
			if (dato == null) {
				continue;
			}
			dato.setProcessId(processId);

			if ("cor".equalsIgnoreCase(dato.getIdDatoDisponibleProceso())) {
				String nombreSecuencia = SECUENCIA_PREFIX + processId;
				dato.setNombreSecuencia(nombreSecuencia);
				crearSecuenciaCorrelativo(nombreSecuencia);
			}

			dato = datoReqProcesoRepository.save(dato);
			int idDatoReqProceso = dato.getIdDatoReqProceso();

			if ("met".equalsIgnoreCase(dato.getIdDatoDisponibleProceso()) && datoReq.getMetadatoRequerido() != null) {
				MetadatoReqProceso metadato = datoReq.getMetadatoRequerido();
				metadato.setIdDatoReqProceso(idDatoReqProceso);
				if (StringUtils.hasText(datoReq.getNombreDocumentoComun())) {
					metadato.setDocComunId(mapaDocComun.getOrDefault(datoReq.getNombreDocumentoComun(), -1));
				}
				metadatoReqProcesoRepository.save(metadato);
			}
		}
	}

private Integer obtenerMecanismoPorDefecto() {
		if (!existeTabla("mecanismo_denominacion")) {
			return null;
		}
		try {
			return (Integer) em.createNativeQuery(
							"SELECT id_mecanismo_denominacion FROM mecanismo_denominacion WHERE por_defecto = true")
					.getSingleResult();
		} catch (NoResultException ex) {
			return null;
		}
	}

	private void crearSecuenciaCorrelativo(String nombreSecuencia) {
		em.createNativeQuery("CREATE SEQUENCE IF NOT EXISTS " + nombreSecuencia).executeUpdate();
	}

	private Activity guardarActividad(ActividadRequest requestActividad, int processId, Map<String, Integer> mapaDocComun) {
		Activity actividad = requestActividad.getActividad();
		if (actividad == null) {
			throw new BusinessException(HttpStatus.BAD_REQUEST, "DATOS_INCOMPLETOS", "Actividad sin objeto \"actividad\"");
		}
		actividad.setProcessId(processId);
		actividad = activityRepository.save(actividad);
		int activityId = actividad.getActivityId();

		for (RolGenericoActividadRequest rolGenerico : requestActividad.getRolesGenericos()) {
			if (rolGenerico.getIdRolGenerico() == null) {
				continue;
			}
			Integer idProcesoCargoGenerico = rolGenerico.getIdProcesoCargoGenerico() != null
					? rolGenerico.getIdProcesoCargoGenerico()
					: processId;
			RolGenericoActividad rol = new RolGenericoActividad();
			rol.setId(new RolGenericoActividadId(activityId, rolGenerico.getIdRolGenerico(), idProcesoCargoGenerico));
			rolGenericoActividadRepository.save(rol);
		}

		Integer docComunActividadId = guardarDocumentosComunesActividad(requestActividad, activityId, mapaDocComun);

		for (ElementosRequeridosRequest elemento : requestActividad.getElementosRequeridos()) {
			if (elemento.getIdElemento() == null) {
				continue;
			}
			ElementosRequeridos rel = new ElementosRequeridos();
			rel.setId(new ElementosRequeridosId(activityId, elemento.getIdElemento()));
			rel.setIdTipoElementoRequerido(elemento.getIdTipoElementoRequerido());
			elementosRequeridosRepository.save(rel);
		}

		for (UsuarioPreAsignadoRequest usuario : requestActividad.getUsuariosPreAsignados()) {
			if (!StringUtils.hasText(usuario.getIdUsuario())) {
				continue;
			}
			UsuariosPreAsignados rel = new UsuariosPreAsignados();
			rel.setId(new UsuariosPreAsignadosId(activityId, usuario.getIdUsuario(), usuario.getIdProcedencia()));
			usuariosPreAsignadosRepository.save(rel);
		}

		for (Integer idRol : requestActividad.getRolesPreAsignados()) {
			RolesPreAsignados rel = new RolesPreAsignados();
			rel.setId(new RolesPreAsignadosId(activityId, idRol));
			rolesPreAsignadosRepository.save(rel);
		}

		if (requestActividad.getIdSubProceso() != null) {
			ActivitiesSubProceso rel = new ActivitiesSubProceso();
			rel.setId(new ActivitiesSubProcesoId(activityId, requestActividad.getIdSubProceso()));
			activitiesSubProcesoRepository.save(rel);
		}

		if (requestActividad.getRegistroExterno() != null) {
			guardarRegistroExterno(requestActividad.getRegistroExterno(), activityId, processId, docComunActividadId);
		}

		if (requestActividad.getTimer() != null) {
			guardarTimerDeActividad(requestActividad.getTimer(), activityId, mapaDocComun);
		}

		if (TIPO_MENSAJE.equalsIgnoreCase(actividad.getActivitytypeId())) {
			guardarMensajeActividad(requestActividad.getMensaje(), activityId, docComunActividadId, mapaDocComun);
		}

		return actividad;
	}

	/**
	 * @return el doc_comun_id del primer documento com�n de la actividad (si existe), usado por el registro externo.
	 */
	private Integer guardarDocumentosComunesActividad(ActividadRequest requestActividad, int activityId, Map<String, Integer> mapaDocComun) {
		Integer primerDocComunId = null;
		for (DocumentoComunActividadRequest docReq : requestActividad.getDocumentosComunesActividad()) {
			if (docReq.getDocumentoComunActividad() == null) {
				continue;
			}
			Integer docComunId = mapaDocComun.get(docReq.getNombreDocComunProceso());
			if (docComunId == null) {
				throw new BusinessException(HttpStatus.UNPROCESSABLE_ENTITY, CODIGO_METADATO_ACTIVIDAD,
						"No se encontr� el documento com�n del proceso \"" + docReq.getNombreDocComunProceso()
								+ "\" para la actividad");
			}
			if (primerDocComunId == null) {
				primerDocComunId = docComunId;
			}

			DocumentoComunActividad dca = docReq.getDocumentoComunActividad();
			if (!docReq.getMetadatosTransferidos().isEmpty()) {
				dca.setTieneMetadatosTransferidos("true");
			}
			dca.setId(new DocumentoComunActividadId(activityId, docComunId));
			documentoComunActividadRepository.save(dca);

			for (MetaDisponiblesActividad metadato : docReq.getMetadatosDisponibles()) {
				MetaDisponiblesActividadId id = metadato.getId();
				if (id == null) {
					continue;
				}
				id.setActivityId(activityId);
				id.setDocComunId(docComunId);
				metaDisponiblesActividadRepository.save(metadato);
			}

			if (docReq.getReglaMultiFormulario() != null) {
				ReglaDocumentoMultiple regla = docReq.getReglaMultiFormulario();
				ReglaDocumentoMultipleId id = regla.getId();
				if (id != null) {
					id.setActivityId(activityId);
					id.setDocComunId(docComunId);
					if (StringUtils.hasText(regla.getNombreDocComunRegla())) {
						id.setDocComunIdRegla(mapaDocComun.getOrDefault(regla.getNombreDocComunRegla(), -1));
					}
					reglaDocumentoMultipleRepository.save(regla);
				}
			}

			for (MetadatoTransferidoActividad metadato : docReq.getMetadatosTransferidos()) {
				metadato.setActivityId(activityId);
				metadato.setDocComunIdDestino(docComunId);
				if (StringUtils.hasText(metadato.getNombreDocComunOrigen())) {
					metadato.setDocComunIdOrigen(mapaDocComun.getOrDefault(metadato.getNombreDocComunOrigen(), -1));
				}
 					metadatoTransferidoActividadRepository.save(metadato);
			}
		}
		return primerDocComunId;
	}

	private void guardarRegistroExterno(RegistroExternoRequest requestRegistro, int activityId, int processId, Integer docComunActividadId) {
		RegistroExternoActivity registro = requestRegistro.getRegistroExterno();
		if (registro == null) {
			return;
		}
		registro.setActivityId(activityId);
		if (Boolean.TRUE.equals(registro.getUsaDocActual())) {
			registro.setProcessId(processId);
			registro.setDocComunId(docComunActividadId);
		}
		try {
			registroExternoActivityRepository.save(registro);
		} catch (RuntimeException ex) {
			throw new BusinessException(HttpStatus.UNPROCESSABLE_ENTITY, CODIGO_REGISTRO_EXTERNO,
					"Error al guardar el registro externo de la actividad", ex);
		}

		for (com.example.workflowapp.model.ClaveRegistroExterno clave : requestRegistro.getClaves()) {
			clave = claveRegistroExternoRepository.save(clave);
			ActivityClaveRegExterno rel = new ActivityClaveRegExterno();
			rel.setId(new ActivityClaveRegExternoId(activityId, clave.getIdClaveRegistroExterno()));
			activityClaveRegExternoRepository.save(rel);
		}
	}

	private void guardarTimerDeActividad(TimerProceso timer, int activityId, Map<String, Integer> mapaDocComun) {
		timer.setDocComunId(resolverDocComunTimer(timer, mapaDocComun));
		timer = timerProcesoRepository.save(timer);
		ActivityTimerProceso rel = new ActivityTimerProceso();
		rel.setId(new ActivityTimerProcesoId(activityId, timer.getIdTimerProceso()));
		activityTimerProcesoRepository.save(rel);
	}

	private Integer resolverDocComunTimer(TimerProceso timer, Map<String, Integer> mapaDocComun) {
		if (Boolean.TRUE.equals(timer.getEsMetFormulario()) && StringUtils.hasText(timer.getNombreDocComun())) {
			return mapaDocComun.getOrDefault(timer.getNombreDocComun(), -1);
		}
		return timer.getDocComunId();
	}

	/**
	 * Migrado desde ActividadesDB#addActividades (rama MENSAJE) +
	 * MensajeActividadDB#agregarMensajeActividad. Orden de inserción idéntico al legacy:
	 * mensaje -> usuario_mensaje -> rol_mensaje -> mensaje_documento ->
	 * metadato_destino_mensaje(+grilla) -> ...Cc -> mensaje_documento_comun_adjunto.
	 */
	private void guardarMensajeActividad(MensajeActividadRequest mensajeReq, int activityId,
			Integer docComunActividadId, Map<String, Integer> mapaDocComun) {
		if (mensajeReq == null) {
			throw new BusinessException(HttpStatus.UNPROCESSABLE_ENTITY, CODIGO_MENSAJE,
					"La actividad de tipo \"mensaje\" debe incluir el objeto \"mensaje\"");
		}

		Mensaje mensaje = new Mensaje();
		mensaje.setActivityId(activityId);
		mensaje.setAsunto(mensajeReq.getAsunto());
		mensaje.setEncabezado(mensajeReq.getEncabezado());
		mensaje.setConCopia(mensajeReq.getCc());
		mensaje.setEnviaACargo(mensajeReq.getEnviaACargo());
		mensaje.setContenido(mensajeReq.getContenido());
		mensaje.setEnviaFormularioExterno(mensajeReq.getEnviaFormularioExterno());
		mensaje = mensajeRepository.save(mensaje);
		int idMensaje = mensaje.getIdMensaje();

		for (String usuario : mensajeReq.getUsuariosSistema()) {
			guardarUsuarioMensaje(idMensaje, usuario, true, false);
		}
		for (String usuario : mensajeReq.getUsuariosSistemaCc()) {
			guardarUsuarioMensaje(idMensaje, usuario, true, true);
		}
		for (String correo : mensajeReq.getUsuariosExternos()) {
			guardarUsuarioMensaje(idMensaje, correo, false, false);
		}
		for (String correo : mensajeReq.getUsuariosExternosCc()) {
			guardarUsuarioMensaje(idMensaje, correo, false, true);
		}

		for (Integer idRol : mensajeReq.getRolesSistema()) {
			RolMensaje rol = new RolMensaje();
			rol.setId(new RolMensajeId(idMensaje, idRol));
			rolMensajeRepository.save(rol);
		}

		int minimoRespuestas = mensajeReq.getUsuariosExternos().size()
				+ mensajeReq.getUsuariosExternosCc().size()
				+ mensajeReq.getUsuariosSistema().size()
				+ mensajeReq.getUsuariosSistemaCc().size()
				+ mensajeReq.getDestinatariosMetadato().size()
				+ mensajeReq.getDestinatariosMetadatoCc().size();

		Integer idDocComunActividad = idDocumentoPrimerDocComun(docComunActividadId);
		if (idDocComunActividad != null && idDocComunActividad > 0) {
			// El legacy reemplaza los formularios del mensaje por el doc común de la
			// actividad, con minimo_respuestas = total de destinatarios.
			MensajeDocumento doc = new MensajeDocumento();
			doc.setId(new MensajeDocumentoId(idMensaje, idDocComunActividad));
			doc.setMinimoRespuestas(minimoRespuestas);
			mensajeDocumentoRepository.save(doc);
		} else {
			for (MensajeDocumentoRequest docReq : mensajeReq.getDocumentosFormulario()) {
				if (docReq.getIdDocumento() == null) {
					continue;
				}
				MensajeDocumento doc = new MensajeDocumento();
				doc.setId(new MensajeDocumentoId(idMensaje, docReq.getIdDocumento()));
				doc.setMinimoRespuestas(docReq.getMinimoRespuestas());
				mensajeDocumentoRepository.save(doc);
			}
		}

		guardarDestinatariosMetadato(idMensaje, mensajeReq.getDestinatariosMetadato(), false, mapaDocComun);
		guardarDestinatariosMetadato(idMensaje, mensajeReq.getDestinatariosMetadatoCc(), true, mapaDocComun);

		for (String nombreAdjunto : mensajeReq.getDocumentosAdjuntos()) {
			if (!StringUtils.hasText(nombreAdjunto)) {
				continue;
			}
			MensajeDocComunAdjunto adjunto = new MensajeDocComunAdjunto();
			adjunto.setId(new MensajeDocComunAdjuntoId(idMensaje, nombreAdjunto));
			mensajeDocComunAdjuntoRepository.save(adjunto);
		}
	}

	private void guardarUsuarioMensaje(int idMensaje, String destinatario, boolean usuarioSistema, boolean copia) {
		if (!StringUtils.hasText(destinatario)) {
			return;
		}
		UsuarioMensaje usuario = new UsuarioMensaje();
		usuario.setId(new UsuarioMensajeId(idMensaje, destinatario));
		usuario.setUsuarioSistema(usuarioSistema);
		usuario.setCopia(copia);
		usuarioMensajeRepository.save(usuario);
	}

	private void guardarDestinatariosMetadato(int idMensaje, List<DestinatarioMetadatoRequest> destinatarios,
			boolean conCopia, Map<String, Integer> mapaDocComun) {
		for (DestinatarioMetadatoRequest destino : destinatarios) {
			if (destino.getIdMetadato() == null || destino.getIdBloque() == null) {
				continue;
			}
			if (!mapaDocComun.containsKey(destino.getNombreDocComun())) {
				throw new BusinessException(HttpStatus.UNPROCESSABLE_ENTITY, CODIGO_MENSAJE,
						"No se encontró el documento común del proceso \"" + destino.getNombreDocComun()
								+ "\" para los destinatarios del mensaje");
			}
			Integer docComunId = mapaDocComun.get(destino.getNombreDocComun());
			boolean esGrilla = Boolean.TRUE.equals(destino.getEsGrilla());
			if (conCopia) {
				MetadatoDestinoMensajeCc destinoCc = new MetadatoDestinoMensajeCc();
				destinoCc.setIdMensaje(idMensaje);
				destinoCc.setDocComunId(docComunId);
				destinoCc.setIdMetadato(destino.getIdMetadato());
				destinoCc.setIdBloque(destino.getIdBloque());
				destinoCc.setEsGrilla(esGrilla);
				destinoCc.setCodigoBloque(destino.getCodigoBloque());
				destinoCc = metadatoDestinoMensajeCcRepository.save(destinoCc);
				if (esGrilla) {
					for (ColumnaGrillaMensajeRequest columna : destino.getColumnasGrilla()) {
						MensajeGrillaCc grilla = new MensajeGrillaCc();
						grilla.setIdMetadatoDestCc(destinoCc.getIdMetadatoDestCc());
						grilla.setIdGrillaMetadato(columna.getIdGrillaMetadato());
						grilla.setIdColumnaGrilla(columna.getIdColumnaGrilla());
						grilla.setDatafield(columna.getDatafield());
						mensajeGrillaCcRepository.save(grilla);
					}
				}
			} else {
				MetadatoDestinoMensaje destinoPara = new MetadatoDestinoMensaje();
				destinoPara.setIdMensaje(idMensaje);
				destinoPara.setDocComunId(docComunId);
				destinoPara.setIdMetadato(destino.getIdMetadato());
				destinoPara.setIdBloque(destino.getIdBloque());
				destinoPara.setEsGrilla(esGrilla);
				destinoPara.setCodigoBloque(destino.getCodigoBloque());
				destinoPara = metadatoDestinoMensajeRepository.save(destinoPara);
				if (esGrilla) {
					for (ColumnaGrillaMensajeRequest columna : destino.getColumnasGrilla()) {
						MensajeGrilla grilla = new MensajeGrilla();
						grilla.setIdMetadatoDestMensaje(destinoPara.getIdMetadatoDest());
						grilla.setIdGrillaMetadato(columna.getIdGrillaMetadato());
						grilla.setIdColumnaGrilla(columna.getIdColumnaGrilla());
						grilla.setDatafield(columna.getDatafield());
						mensajeGrillaRepository.save(grilla);
					}
				}
			}
		}
	}

	private Integer idDocumentoPrimerDocComun(Integer docComunActividadId) {
		if (docComunActividadId == null) {
			return null;
		}
		return documentoComunProcesoRepository.findById(docComunActividadId)
				.map(DocumentoComunProceso::getIdDocumento)
				.orElse(null);
	}

	private void guardarTransicion(TransicionRequest requestTransicion, int processId, Map<String, Integer> mapaDocComun,
			Map<String, Integer> actividadIdPorElemento) {
		Transition transicion = requestTransicion.getTransicion();
		if (transicion == null) {
			throw new BusinessException(HttpStatus.BAD_REQUEST, "DATOS_INCOMPLETOS",
					"Transici�n sin objeto \"transicion\"");
		}

		Integer activityIdSource = actividadIdPorElemento.get(requestTransicion.getIdActividadOrigen());
		Integer activityIdDestination = actividadIdPorElemento.get(requestTransicion.getIdActividadDestino());
		if (activityIdSource == null || activityIdDestination == null) {
			throw new BusinessException(HttpStatus.BAD_REQUEST, "DATOS_INCOMPLETOS",
					"No se pudieron resolver las actividades origen/destino de la transici�n \""
							+ transicion.getTransitionName() + "\"");
		}

		transicion.setActivityIdSource(activityIdSource);
		transicion.setActivityIdDestination(activityIdDestination);
		transicion.setProcessId(processId);
		transicion.setTieneTimer(Boolean.TRUE.equals(requestTransicion.getTieneTimer()));
		transicion = transitionRepository.save(transicion);
		int transitionId = transicion.getTransitionId();

		for (ReglaUsuario regla : requestTransicion.getReglasUsuario()) {
			if (StringUtils.hasText(regla.getNombreDocComun())) {
				regla.setIdDocIzq(mapaDocComun.getOrDefault(regla.getNombreDocComun(), -1));
			}
			regla = reglaUsuarioRepository.save(regla);
			TransitionReglaUsuario rel = new TransitionReglaUsuario();
			rel.setId(new TransitionReglaUsuarioId(transitionId, regla.getIdReglaUsuario()));
			transitionReglaUsuarioRepository.save(rel);
		}

		for (ReglaNegocioRequest reglaNegocio : requestTransicion.getReglasNegocio()) {
			guardarReglaNegocio(reglaNegocio, transitionId, mapaDocComun);
		}

		if (Boolean.TRUE.equals(requestTransicion.getTieneTimer()) && requestTransicion.getTimer() != null) {
			TimerProceso timer = requestTransicion.getTimer();
			timer.setDocComunId(resolverDocComunTimer(timer, mapaDocComun));
			timer = timerProcesoRepository.save(timer);
			TransitionTimerProceso rel = new TransitionTimerProceso();
			rel.setId(new TransitionTimerProcesoId(transitionId, timer.getIdTimerProceso()));
			rel.setConInterrupcion(requestTransicion.getConInterrupcion());
			transitionTimerProcesoRepository.save(rel);
		}
	}

	private void guardarReglaNegocio(ReglaNegocioRequest reglaNegocio, int transitionId, Map<String, Integer> mapaDocComun) {
		if (reglaNegocio.getIdOperadorRegla() == null || reglaNegocio.getOperandoIzq() == null
				|| reglaNegocio.getOperandoDer() == null) {
			throw new BusinessException(HttpStatus.UNPROCESSABLE_ENTITY, CODIGO_REGLAS_NEGOCIO,
					"Regla de negocio incompleta (faltan operador u operandos)");
		}

		Integer idOperandoIzq = guardarOperando(reglaNegocio.getOperandoIzq(), mapaDocComun);
		Integer idOperandoDer = guardarOperando(reglaNegocio.getOperandoDer(), mapaDocComun);

		ReglaDeNegocio regla = new ReglaDeNegocio();
		regla.setIdOperadorRegla(reglaNegocio.getIdOperadorRegla());
		regla.setIdOperandoIzq(idOperandoIzq);
		regla.setIdOperandoDer(idOperandoDer);
		regla = reglaDeNegocioRepository.save(regla);

		TransitionReglaNegocio rel = new TransitionReglaNegocio();
		rel.setId(new TransitionReglaNegocioId(transitionId, regla.getIdReglaNegocio()));
		transitionReglaNegocioRepository.save(rel);
	}

	private Integer guardarOperando(OperandoReglaRequest operandoRequest, Map<String, Integer> mapaDocComun) {
		OperandoRegla operando = new OperandoRegla();
		operando.setValorOperando(operandoRequest.getValorOperando());
		operando.setEsDoc(operandoRequest.getEsDoc());
		operando = operandoReglaRepository.save(operando);
		int idOperando = operando.getIdOperandoRegla();

		if (Boolean.TRUE.equals(operandoRequest.getEsDoc())) {
			OperandoReglaDocumento detalle = new OperandoReglaDocumento();
			detalle.setIdOperandoRegla(idOperando);
			detalle.setDocComunId(mapaDocComun.getOrDefault(operandoRequest.getNombreDocComun(), -1));
			detalle.setIdBloque(operandoRequest.getIdBloque());
			detalle.setCodigoBloque(operandoRequest.getCodigoBloque());
			detalle.setIdMetadato(operandoRequest.getIdMetadato());
			detalle.setIdTipoDato(operandoRequest.getIdTipoDato());
			operandoReglaDocumentoRepository.save(detalle);
		}
		return idOperando;
	}

	private void guardarEnCatalogo(CrearProcesoRequest request, int processId, Map<String, Integer> actividadIdPorElemento) {
		// El legado asocia el catálogo al primer nodo tarea del flujo (destino de la transición
		// que sale del nodo inicio), nunca al nodo inicio.
		String idElementoInicio = encontrarIdElementoInicio(request.getActividades());
		if (idElementoInicio == null) {
			return;
		}
		String idElementoPrimeraTarea = idActividadSiguienteAlInicio(idElementoInicio, request.getTransiciones());
		Integer activityIdInicial = actividadIdPorElemento.get(idElementoPrimeraTarea);
		if (activityIdInicial == null) {
			return;
		}
		for (Integer idCatalogo : request.getCatalogos()) {
			ProcesoCatalogo catalogo = new ProcesoCatalogo();
			catalogo.setId(new ProcesoCatalogoId(idCatalogo, processId));
			catalogo.setIdDocumento(request.getIdDocumentoPublicar());
			catalogo.setActivityId(activityIdInicial);
			procesoCatalogoRepository.save(catalogo);
		}
	}

	private Boolean calcularEsInstanciable(List<ActividadRequest> actividades, List<TransicionRequest> transiciones) {
		String idActInicio = encontrarIdElementoInicio(actividades);
		if (idActInicio == null) {
			return null;
		}
		String idActSig = idActividadSiguienteAlInicio(idActInicio, transiciones);
		if (idActSig == null) {
			return null;
		}
		int pos = obtenerPosicionActividadPorIdElemento(idActSig, actividades);
		if (pos < 0) {
			return null;
		}
		return esInstanciable(actividades, transiciones, pos);
	}

	private Boolean esInstanciable(List<ActividadRequest> actividades, List<TransicionRequest> transiciones, int pos) {
		ActividadRequest actividadRequest = actividades.get(pos);
		Activity actividad = actividadRequest.getActividad();

		if (!TIPO_SUBPROCESO.equalsIgnoreCase(actividad.getActivitytypeId())) {
			if (!StringUtils.hasText(actividad.getFuncionality())) {
				return true;
			}
			Boolean requiereObjetoPrevio = requiereObjetoPrevio(actividad.getFuncionality());
			return !Boolean.TRUE.equals(requiereObjetoPrevio);
		}

		if (actividadRequest.getIdSubProceso() == null) {
			return false;
		}
		List<Activity> actividadesSubProceso = activityRepository.findByProcessId(actividadRequest.getIdSubProceso());
		List<Transition> transicionesSubProceso = transitionRepository.findByProcessId(
				actividadRequest.getIdSubProceso());

		String idActIni = encontrarIdElementoInicio(listToRequests(actividadesSubProceso));
		if (idActIni == null) {
			return false;
		}
		String idActSig = idActividadSiguienteAlInicio(idActIni, listToTransicionRequests(transicionesSubProceso));
		if (idActSig == null) {
			return false;
		}
		int posSub = obtenerPosicionActividadPorIdElemento(idActSig, listToRequests(actividadesSubProceso));
		if (posSub < 0) {
			return false;
		}
		return esInstanciable(listToRequests(actividadesSubProceso), listToTransicionRequests(transicionesSubProceso), posSub);
	}

private Boolean requiereObjetoPrevio(String funcionalityId) {
		if (!existeTabla("funcionalidades")) {
			return null;
		}
		try {
			Object valor = em.createNativeQuery(
							"SELECT requiere_objeto_previo FROM funcionalidades WHERE id_funcionalidad = :id")
					.setParameter("id", funcionalityId)
					.getSingleResult();
			return valor == null ? null : (Boolean) valor;
		} catch (NoResultException ex) {
			return null;
		}
	}

	private Boolean existeTabla(String nombreTabla) {
		try {
			return em.createNativeQuery("SELECT to_regclass('" + nombreTabla + "')")
					.getSingleResult() != null;
		} catch (RuntimeException ex) {
			return false;
		}
	}

	private String encontrarIdElementoInicio(List<ActividadRequest> actividades) {
		for (ActividadRequest actividadRequest : actividades) {
			Activity actividad = actividadRequest.getActividad();
			if (actividad != null && TIPO_INICIO.equalsIgnoreCase(actividad.getActivitytypeId())) {
				return actividad.getIdElemento();
			}
		}
		return null;
	}

	private String idActividadSiguienteAlInicio(String idActInicio, List<TransicionRequest> transiciones) {
		for (TransicionRequest transicionRequest : transiciones) {
			if (idActInicio.equalsIgnoreCase(transicionRequest.getIdActividadOrigen())) {
				return transicionRequest.getIdActividadDestino();
			}
		}
		return null;
	}

	private int obtenerPosicionActividadPorIdElemento(String idElemento, List<ActividadRequest> actividades) {
		for (int i = 0; i < actividades.size(); i++) {
			Activity actividad = actividades.get(i).getActividad();
			if (actividad != null && idElemento.equalsIgnoreCase(actividad.getIdElemento())) {
				return i;
			}
		}
		return -1;
	}

	private List<ActividadRequest> listToRequests(List<Activity> actividades) {
		return actividades.stream().map(a -> {
			ActividadRequest ar = new ActividadRequest();
			ar.setActividad(a);
			return ar;
		}).toList();
	}

	private List<TransicionRequest> listToTransicionRequests(List<Transition> transiciones) {
		return transiciones.stream().map(t -> {
			TransicionRequest tr = new TransicionRequest();
			tr.setTransicion(t);
			return tr;
		}).toList();
	}
}