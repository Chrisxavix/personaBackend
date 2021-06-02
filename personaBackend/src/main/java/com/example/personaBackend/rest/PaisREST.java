package com.example.personaBackend.rest;

import com.example.personaBackend.model.Pais;
import com.example.personaBackend.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
/* Nos da la URL base para acceder */
@RequestMapping("/pais/")
public class PaisREST {

    @Autowired
    private PaisService paisService;

    /* Hanilitar peticiones get */
    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises (){
        return ResponseEntity.ok(paisService.findAll());
    }
}
