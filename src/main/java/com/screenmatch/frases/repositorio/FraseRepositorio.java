package com.screenmatch.frases.repositorio;

import com.screenmatch.frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FraseRepositorio extends JpaRepository<Frase, Long>{

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase obtenerFrase();

}
