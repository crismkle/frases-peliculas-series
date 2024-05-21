package com.screenmatch.frases.service;

import com.screenmatch.frases.dto.FraseDTO;
import com.screenmatch.frases.model.Frase;
import com.screenmatch.frases.repositorio.FraseRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {

    @Autowired
    private FraseRepositorio repository;

    public FraseDTO obtenerFrase() {
        Frase frase = repository.obtenerFrase();
        return new FraseDTO(frase.getTitulo(), frase.getCita(), frase.getAutor(), frase.getPoster());
    }
}
