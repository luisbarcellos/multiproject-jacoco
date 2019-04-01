package br.com.jacoco;

import br.com.jacoco.service.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(Controller.class)
public class ControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private Service service;

    @Test
    public void deveRetornarHelloWorldImpl() throws Exception{
        this.mockMvc.perform(get("/hello-world/impl"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(status().is(200))
                .andReturn()
                .getResponse()
                .getContentAsString()
                .contains("impl");
    }

    @Test
    public void deveRetornarHelloWorldIntegracao() throws Exception{
        this.mockMvc.perform(get("/hello-world/integracao"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(status().is(200))
                .andReturn()
                .getResponse()
                .getContentAsString()
                .contains("Integracao");
    }

    @Configuration
    @ComponentScan(basePackageClasses = { Controller.class })
    public static class TestConf {}
}