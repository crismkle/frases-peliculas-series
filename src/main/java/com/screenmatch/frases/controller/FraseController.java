package com.screenmatch.frases.controller;

import com.screenmatch.frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

//    @Autowired
//    private FraseService servicio;
    @GetMapping("/series")
    public String mostrarMensaje(){
        return "Este es mi primer mensaje";
    }
}
