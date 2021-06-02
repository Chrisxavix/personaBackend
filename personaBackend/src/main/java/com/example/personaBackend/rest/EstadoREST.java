package com.example.personaBackend.rest;

import com.example.personaBackend.model.Estado;
import com.example.personaBackend.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados/")
public class EstadoREST {

    @Autowired
    private EstadoService estadoService;

    /* Recibe por parámetro una Id */
    @GetMapping("{id}")
    private ResponseEntity<List<Estado>> getAllEstadosByPais (@PathVariable("id") Long idPais){
        /* Envía el Id de país para que retorne solo los estados de ese país */
        return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
    }
}
