package br.alura.com.randomsetencegenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.alura.com.randomsetencegenerator.dto.FraseDTO;

import br.alura.com.randomsetencegenerator.service.FraseService;

@RestController
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatória() {
        return servico.obterFraseAleatoria();
    }

}
