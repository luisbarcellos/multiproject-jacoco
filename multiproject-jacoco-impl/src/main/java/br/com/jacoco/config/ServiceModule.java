package br.com.jacoco.config;

import br.com.jacoco.service.IntegracaoService;
import br.com.jacoco.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceModule {
    @Bean
    public Service service(IntegracaoService integracaoService) {
        return new Service(integracaoService);
    }
}