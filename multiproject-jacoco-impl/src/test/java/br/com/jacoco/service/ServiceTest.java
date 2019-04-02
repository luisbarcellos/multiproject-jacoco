package br.com.jacoco.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {
    @Mock
    private IntegracaoService integracaoService;

    @InjectMocks
    private Service service;

    @Test
    public void deveRetornarHelloImpl() {
        assertTrue(service.helloImpl().contains("impl"));
    }

    @Test
    public void deveRetornarHelloIntegracao() {
        Mockito.when(integracaoService.helloIntegracao()).thenReturn("Hello World Integracao!");

        assertTrue(integracaoService.helloIntegracao().contains("Integracao"));
    }
}
