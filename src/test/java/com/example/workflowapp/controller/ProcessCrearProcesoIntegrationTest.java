package com.example.workflowapp.controller;

import com.example.workflowapp.CrearProcesoRequestFixture;
import com.example.workflowapp.model.ActividadRequest;
import com.example.workflowapp.model.Activity;
import com.example.workflowapp.model.CrearProcesoRequest;
import com.example.workflowapp.model.MetaDisponiblesActividad;
import com.example.workflowapp.model.Mensaje;
import com.example.workflowapp.model.MensajeActividadRequest;
import com.example.workflowapp.model.UsuarioMensaje;
import com.example.workflowapp.model.ProcesoCreadoResponse;
import com.example.workflowapp.model.ProcesoCatalogo;
import com.example.workflowapp.model.ProcesoCatalogoId;
import com.example.workflowapp.model.Transition;
import com.example.workflowapp.model.WorkflowProcess;
import com.example.workflowapp.support.XmlDiagramaUtil;
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
import com.example.workflowapp.repository.MensajeRepository;
import com.example.workflowapp.repository.MensajeDocComunAdjuntoRepository;
import com.example.workflowapp.repository.MensajeDocumentoRepository;
import com.example.workflowapp.repository.MensajeGrillaCcRepository;
import com.example.workflowapp.repository.MensajeGrillaRepository;
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
import com.example.workflowapp.repository.RolMensajeRepository;
import com.example.workflowapp.repository.RolesPreAsignadosRepository;
import com.example.workflowapp.repository.RolGenericoActividadRepository;
import com.example.workflowapp.repository.RolGenericoProcesoRepository;
import com.example.workflowapp.repository.TimerProcesoRepository;
import com.example.workflowapp.repository.TransitionReglaNegocioRepository;
import com.example.workflowapp.repository.TransitionReglaUsuarioRepository;
import com.example.workflowapp.repository.TransitionRepository;
import com.example.workflowapp.repository.TransitionTimerProcesoRepository;
import com.example.workflowapp.repository.UsuarioMensajeRepository;
import com.example.workflowapp.repository.UsuariosPreAsignadosRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, properties = {
		"spring.datasource.url=jdbc:postgresql://192.168.18.18:5432/uniboxInfor_20250612",
		"spring.datasource.username=postgres",
		"spring.datasource.password=mbx@7",
		"spring.jpa.hibernate.ddl-auto=none"
})
@AutoConfigureMockMvc
class ProcessCrearProcesoIntegrationTest {

	private static final int PROCESS_ID_ORIGEN = 1234;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private ProcessRepository processRepository;
	@Autowired
	private PermisoProcesoRepository permisoProcesoRepository;
	@Autowired
	private PermisoRolProcesoRepository permisoRolProcesoRepository;
	@Autowired
	private PermisoGrupoProcesoRepository permisoGrupoProcesoRepository;
	@Autowired
	private RolGenericoProcesoRepository rolGenericoProcesoRepository;
	@Autowired
	private DocumentoComunProcesoRepository documentoComunProcesoRepository;
	@Autowired
	private PermisoUsuarioDocComunRepository permisoUsuarioDocComunRepository;
	@Autowired
	private PermisoRolDocComunRepository permisoRolDocComunRepository;
	@Autowired
	private PermisoGrupoDocComunRepository permisoGrupoDocComunRepository;
	@Autowired
	private ResponsableProcesoRepository responsableProcesoRepository;
	@Autowired
	private CondicionVisibilidadProcesoRepository condicionVisibilidadProcesoRepository;
	@Autowired
	private PermisoProcesoCondicionRepository permisoProcesoCondicionRepository;
	@Autowired
	private ProcesoMecanismoDenominacionRepository procesoMecanismoDenominacionRepository;
	@Autowired
	private DatoReqProcesoRepository datoReqProcesoRepository;
	@Autowired
	private MetadatoReqProcesoRepository metadatoReqProcesoRepository;
	@Autowired
	private ProcesoCatalogoRepository procesoCatalogoRepository;
	@Autowired
	private ActivityRepository activityRepository;
	@Autowired
	private RolGenericoActividadRepository rolGenericoActividadRepository;
	@Autowired
	private DocumentoComunActividadRepository documentoComunActividadRepository;
	@Autowired
	private MetaDisponiblesActividadRepository metaDisponiblesActividadRepository;
	@Autowired
	private ReglaDocumentoMultipleRepository reglaDocumentoMultipleRepository;
	@Autowired
	private MetadatoTransferidoActividadRepository metadatoTransferidoActividadRepository;
	@Autowired
	private ElementosRequeridosRepository elementosRequeridosRepository;
	@Autowired
	private UsuariosPreAsignadosRepository usuariosPreAsignadosRepository;
	@Autowired
	private RolesPreAsignadosRepository rolesPreAsignadosRepository;
	@Autowired
	private ActivitiesSubProcesoRepository activitiesSubProcesoRepository;
	@Autowired
	private RegistroExternoActivityRepository registroExternoActivityRepository;
	@Autowired
	private ClaveRegistroExternoRepository claveRegistroExternoRepository;
	@Autowired
	private ActivityClaveRegExternoRepository activityClaveRegExternoRepository;
	@Autowired
	private TimerProcesoRepository timerProcesoRepository;
	@Autowired
	private ActivityTimerProcesoRepository activityTimerProcesoRepository;
	@Autowired
	private TransitionRepository transitionRepository;
	@Autowired
	private TransitionTimerProcesoRepository transitionTimerProcesoRepository;
	@Autowired
	private ReglaUsuarioRepository reglaUsuarioRepository;
	@Autowired
	private TransitionReglaUsuarioRepository transitionReglaUsuarioRepository;
	@Autowired
	private OperandoReglaRepository operandoReglaRepository;
	@Autowired
	private OperandoReglaDocumentoRepository operandoReglaDocumentoRepository;
	@Autowired
	private ReglaDeNegocioRepository reglaDeNegocioRepository;
	@Autowired
	private TransitionReglaNegocioRepository transitionReglaNegocioRepository;
	@Autowired
	private MensajeRepository mensajeRepository;
	@Autowired
	private UsuarioMensajeRepository usuarioMensajeRepository;
	@Autowired
	private RolMensajeRepository rolMensajeRepository;
	@Autowired
	private MensajeDocumentoRepository mensajeDocumentoRepository;
	@Autowired
	private MetadatoDestinoMensajeRepository metadatoDestinoMensajeRepository;
	@Autowired
	private MetadatoDestinoMensajeCcRepository metadatoDestinoMensajeCcRepository;
	@Autowired
	private MensajeGrillaRepository mensajeGrillaRepository;
	@Autowired
	private MensajeGrillaCcRepository mensajeGrillaCcRepository;
	@Autowired
	private MensajeDocComunAdjuntoRepository mensajeDocComunAdjuntoRepository;

	private CrearProcesoRequestFixture fixture;

	@BeforeEach
	void setUp() {
		fixture = new CrearProcesoRequestFixture(objectMapper, processRepository, permisoProcesoRepository,
				permisoRolProcesoRepository, permisoGrupoProcesoRepository, rolGenericoProcesoRepository,
				documentoComunProcesoRepository, permisoUsuarioDocComunRepository, permisoRolDocComunRepository,
				permisoGrupoDocComunRepository, responsableProcesoRepository, condicionVisibilidadProcesoRepository,
				permisoProcesoCondicionRepository, procesoMecanismoDenominacionRepository, datoReqProcesoRepository,
				metadatoReqProcesoRepository, procesoCatalogoRepository, activityRepository,
				rolGenericoActividadRepository, documentoComunActividadRepository, metaDisponiblesActividadRepository,
				reglaDocumentoMultipleRepository, metadatoTransferidoActividadRepository, elementosRequeridosRepository,
				usuariosPreAsignadosRepository, rolesPreAsignadosRepository, activitiesSubProcesoRepository,
				registroExternoActivityRepository, claveRegistroExternoRepository, activityClaveRegExternoRepository,
				timerProcesoRepository, activityTimerProcesoRepository, transitionRepository,
				transitionTimerProcesoRepository, reglaUsuarioRepository, transitionReglaUsuarioRepository,
				operandoReglaRepository, operandoReglaDocumentoRepository, reglaDeNegocioRepository,
				transitionReglaNegocioRepository, mensajeRepository, usuarioMensajeRepository,
				rolMensajeRepository, mensajeDocumentoRepository, metadatoDestinoMensajeRepository,
				metadatoDestinoMensajeCcRepository, mensajeGrillaRepository, mensajeGrillaCcRepository,
				mensajeDocComunAdjuntoRepository);
	}

	@Test
	@WithMockUser
	void crearProcesoConMismoNombreDevuelve409() throws Exception {
		WorkflowProcess origen = processRepository.findById(PROCESS_ID_ORIGEN).orElseThrow();
		String body = "{\"proceso\":{\"processName\":\""
				+ origen.getProcessName().replace("\"", "\\\"") + "\"}}";

		mockMvc.perform(post("/api/processes")
						.contentType(MediaType.APPLICATION_JSON)
						.content(body))
				.andExpect(status().isConflict())
				.andExpect(jsonPath("$.codigo").value("PROCESO_NOMBRE_DUPLICADO"));
	}

	@Test
	@WithMockUser
	void crearProcesoCopiandoConfiguracionDevuelve201() throws Exception {
		String nuevoNombre = "test-crear-proceso-" + UUID.randomUUID();
		CrearProcesoRequest request = fixture.buildFrom(PROCESS_ID_ORIGEN, nuevoNombre);

		String xmlEsperado = processRepository.findById(PROCESS_ID_ORIGEN).orElseThrow().getPath();
		assertTrue(xmlEsperado != null && !xmlEsperado.isBlank(),
				"El proceso base debe tener un diagrama XML en path");

		MvcResult result = mockMvc.perform(post("/api/processes")
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(request)))
				.andExpect(status().isCreated())
				.andExpect(jsonPath("$.processId").isNumber())
				.andReturn();

		Integer nuevoProcessId = objectMapper.readValue(result.getResponse().getContentAsString(),
				ProcesoCreadoResponse.class).getProcessId();

		// La copia no puede arrastrar name/processId del origen: el motor legacy resuelve
		// la definici�n por el name del XML y por processId al cerrar el flujo.
		String xmlEsperadoRegenerado = XmlDiagramaUtil.regenerarDiagrama(xmlEsperado, nuevoNombre, nuevoProcessId);
		String xmlPersistido = processRepository.findById(nuevoProcessId).orElseThrow().getPath();
		assertEquals(xmlEsperadoRegenerado, xmlPersistido);

		// El catálogo debe apuntar al primer nodo tarea (destino de la transición del
		// inicio), nunca al nodo inicio.
		List<Activity> actividadesNuevas = activityRepository.findByProcessId(nuevoProcessId);
		Integer activityIdInicio = actividadesNuevas.stream()
				.filter(a -> "inicio".equalsIgnoreCase(a.getActivitytypeId()))
				.map(Activity::getActivityId)
				.findFirst()
				.orElseThrow();
		Integer activityIdPrimeraTarea = transitionRepository.findByProcessId(nuevoProcessId).stream()
				.filter(t -> activityIdInicio.equals(t.getActivityIdSource()))
				.map(Transition::getActivityIdDestination)
				.findFirst()
				.orElseThrow();

		if (!request.getCatalogos().isEmpty()) {
			ProcesoCatalogoId idCatalogo = new ProcesoCatalogoId(request.getCatalogos().get(0), nuevoProcessId);
			ProcesoCatalogo catalogo = procesoCatalogoRepository.findById(idCatalogo).orElseThrow();
			assertEquals(activityIdPrimeraTarea, catalogo.getActivityId());
			assertTrue(!activityIdInicio.equals(catalogo.getActivityId()),
					"proceso_catalogo no debe apuntar al nodo inicio");
		}

		// El codigo_bloque de los metadatos disponibles debe copiarse desde el origen.
		Map<Integer, String> codigosOrigen = new HashMap<>();
		for (Activity actividadOrigen : activityRepository.findByProcessId(PROCESS_ID_ORIGEN)) {
			for (MetaDisponiblesActividad metadato : metaDisponiblesActividadRepository
					.findByIdActivityId(actividadOrigen.getActivityId())) {
				codigosOrigen.put(metadato.getId().getIdMetadato(), metadato.getCodigoBloque());
			}
		}
		assertTrue(!codigosOrigen.isEmpty(), "El proceso origen debe tener metadatos con codigo_bloque");

		List<MetaDisponiblesActividad> metadatosNuevos = metaDisponiblesActividadRepository
				.findByIdActivityId(activityIdPrimeraTarea);
		assertEquals(12, metadatosNuevos.size());
		for (MetaDisponiblesActividad metadato : metadatosNuevos) {
			assertEquals(codigosOrigen.get(metadato.getId().getIdMetadato()), metadato.getCodigoBloque(),
					"codigo_bloque distinto al del origen para el metadato " + metadato.getId().getIdMetadato());
		}

		// Los nodos mensaje de la copia deben replicar la configuración del origen.
		List<Activity> mensajesNuevos = actividadesNuevas.stream()
				.filter(a -> "mensaje".equalsIgnoreCase(a.getActivitytypeId()))
				.toList();
		long mensajesOrigenCount = activityRepository.findByProcessId(PROCESS_ID_ORIGEN).stream()
				.filter(a -> "mensaje".equalsIgnoreCase(a.getActivitytypeId()))
				.count();
		assertEquals(mensajesOrigenCount, mensajesNuevos.size());
		Map<String, Integer> idElementoOrigenAActivity = new HashMap<>();
		for (Activity actividadOrigen : activityRepository.findByProcessId(PROCESS_ID_ORIGEN)) {
			idElementoOrigenAActivity.put(actividadOrigen.getIdElemento(), actividadOrigen.getActivityId());
		}
		for (Activity mensajeNuevo : mensajesNuevos) {
			Mensaje mensajeCopia = mensajeRepository.findFirstByActivityId(mensajeNuevo.getActivityId()).orElseThrow();
			Integer activityIdOrigen = idElementoOrigenAActivity.get(mensajeNuevo.getIdElemento());
			Mensaje mensajeOrigen = mensajeRepository.findFirstByActivityId(activityIdOrigen).orElseThrow();
			assertEquals(mensajeOrigen.getAsunto(), mensajeCopia.getAsunto());
			assertEquals(mensajeOrigen.getContenido(), mensajeCopia.getContenido());
		}
	}

	@Test
	@WithMockUser
	void crearProcesoConNodoMensajeCreaFilasMensaje() throws Exception {
		String nuevoNombre = "test-crear-proceso-con-mensaje-" + UUID.randomUUID();
		CrearProcesoRequest request = fixture.buildFrom(PROCESS_ID_ORIGEN, nuevoNombre);

		String idElementoMensaje = "Mensaje TEST " + UUID.randomUUID();
		ActividadRequest base = request.getActividades().get(0);
		Activity actividadMensaje = objectMapper.readValue(
				objectMapper.writeValueAsString(base.getActividad()), Activity.class);
		actividadMensaje.setActivityId(null);
		actividadMensaje.setProcessId(null);
		actividadMensaje.setIdElemento(idElementoMensaje);
		actividadMensaje.setActivityName("Mensaje Test");
		actividadMensaje.setActivitytypeId("mensaje");

		ActividadRequest nodoMensaje = new ActividadRequest();
		nodoMensaje.setActividad(actividadMensaje);
		MensajeActividadRequest mensajeReq = new MensajeActividadRequest();
		mensajeReq.setAsunto("Asunto test mensaje");
		mensajeReq.setContenido("Contenido test mensaje");
		mensajeReq.setEncabezado(true);
		mensajeReq.setCc(false);
		mensajeReq.setEnviaACargo(false);
		mensajeReq.setEnviaFormularioExterno(false);
		mensajeReq.setUsuariosSistema(List.of("soportemovilgo"));
		mensajeReq.setUsuariosExternos(List.of("destinatario-test@mail.cl"));
		nodoMensaje.setMensaje(mensajeReq);
		request.getActividades().add(nodoMensaje);

		MvcResult result = mockMvc.perform(post("/api/processes")
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(request)))
				.andExpect(status().isCreated())
				.andReturn();
		Integer nuevoProcessId = objectMapper.readValue(result.getResponse().getContentAsString(),
				ProcesoCreadoResponse.class).getProcessId();

		Activity mensajeCreado = activityRepository.findByProcessId(nuevoProcessId).stream()
				.filter(a -> idElementoMensaje.equals(a.getIdElemento()))
				.findFirst()
				.orElseThrow();
		Mensaje mensaje = mensajeRepository.findFirstByActivityId(mensajeCreado.getActivityId()).orElseThrow();
		assertEquals("Asunto test mensaje", mensaje.getAsunto());
		assertEquals("Contenido test mensaje", mensaje.getContenido());
		assertEquals(Boolean.TRUE, mensaje.getEncabezado());

		List<UsuarioMensaje> destinatarios = usuarioMensajeRepository.findByIdIdMensaje(mensaje.getIdMensaje());
		assertEquals(2, destinatarios.size());
		assertTrue(destinatarios.stream().anyMatch(d -> "soportemovilgo".equals(d.getId().getDestinatario())
				&& Boolean.TRUE.equals(d.getUsuarioSistema()) && !Boolean.TRUE.equals(d.getCopia())));
		assertTrue(destinatarios.stream().anyMatch(d -> "destinatario-test@mail.cl".equals(d.getId().getDestinatario())
				&& !Boolean.TRUE.equals(d.getUsuarioSistema()) && !Boolean.TRUE.equals(d.getCopia())));
	}

	@Test
	@WithMockUser
	void crearProcesoConNodoMensajeSinObjetoMensajeDevuelve422() throws Exception {
		String nuevoNombre = "test-crear-proceso-sin-mensaje-" + UUID.randomUUID();
		CrearProcesoRequest request = fixture.buildFrom(PROCESS_ID_ORIGEN, nuevoNombre);
		// Se fuerza un nodo mensaje sin objeto "mensaje" para validar el fail-fast.
		ActividadRequest nodoMensaje = request.getActividades().get(0);
		nodoMensaje.getActividad().setActivitytypeId("mensaje");
		nodoMensaje.setMensaje(null);

		mockMvc.perform(post("/api/processes")
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(request)))
				.andExpect(status().isUnprocessableEntity())
				.andExpect(jsonPath("$.codigo").value("ERROR_MENSAJE_ACTIVIDAD"));
	}
}