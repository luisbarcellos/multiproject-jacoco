package br.com.jacoco;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class IntegracaoServiceTest {
    @InjectMocks
    private IntegracaoService integracaoService;

    @Test
    public void deveRetornarHelloIntegracao() {
        assertTrue(integracaoService.helloIntegracao().contains("Integracao"));
    }
}