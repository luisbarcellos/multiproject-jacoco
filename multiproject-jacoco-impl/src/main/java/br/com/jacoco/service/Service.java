package br.com.jacoco.service;

import br.com.jacoco.IntegracaoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Service {
    private IntegracaoService integracaoService;

    public String helloImpl() {
        return "Hello World impl!";
    }

    public String helloIntegracao() {
        return integracaoService.helloIntegracao();
    }
}