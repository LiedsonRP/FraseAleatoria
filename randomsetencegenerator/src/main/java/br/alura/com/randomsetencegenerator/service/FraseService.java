package br.alura.com.randomsetencegenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.alura.com.randomsetencegenerator.dto.FraseDTO;
import br.alura.com.randomsetencegenerator.repository.FraseRepository;
import br.alura.com.randomsetencegenerator.model.Frase;

@Service
public class FraseService {
    
    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscarFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getPersonagem(), frase.getTitulo(), frase.getPoster());
    }
}
