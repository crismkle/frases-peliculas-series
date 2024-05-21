package com.screenmatch.frases.controller;

import com.screenmatch.frases.dto.FraseDTO;
import com.screenmatch.frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraseController {

    @Autowired
    private FraseService servicio;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFrase(){
        return servicio.obtenerFrase();
    }
}
