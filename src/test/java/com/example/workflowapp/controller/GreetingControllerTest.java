package com.example.workflowapp.controller;

import com.example.workflowapp.config.SecurityConfig;
import com.example.workflowapp.model.Greeting;
import com.example.workflowapp.repository.GreetingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GreetingController.class)
@Import(SecurityConfig.class)
class GreetingControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private GreetingRepository repository;

	@Test
	void getListIsPermittedWithoutAuthentication() throws Exception {
		when(repository.findAll()).thenReturn(List.of(new Greeting("Hola")));

		mockMvc.perform(get("/api/greetings"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$[0].message").value("Hola"));
	}

	@Test
	void createRequiresAuthentication() throws Exception {
		mockMvc.perform(post("/api/greetings")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\"message\":\"nuevo\"}"))
				.andExpect(status().isUnauthorized());
	}

	@Test
	@WithMockUser
	void createReturnsCreatedWhenAuthenticated() throws Exception {
		when(repository.save(any(Greeting.class))).thenAnswer(invocation -> invocation.getArgument(0));

		mockMvc.perform(post("/api/greetings")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\"message\":\"nuevo\"}"))
				.andExpect(status().isCreated())
				.andExpect(jsonPath("$.message").value("nuevo"));
	}
}
