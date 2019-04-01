package br.com.jacoco.config;

import br.com.jacoco.IntegracaoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntegracaoModule {
    @Bean
    public IntegracaoService integracaoService() {
        return new IntegracaoService();
    }
}