package br.com.jacoco;

import br.com.jacoco.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/impl")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return service.helloImpl();
    }

    @GetMapping("/integracao")
    @ResponseStatus(HttpStatus.OK)
    public String helloIntegracao() {
        return service.helloIntegracao();
    }
}