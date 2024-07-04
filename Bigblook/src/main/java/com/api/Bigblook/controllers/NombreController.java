package com.api.Bigblook.controllers;


import com.api.Bigblook.models.Nombre;
import com.api.Bigblook.services.NombreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nombres")
public class NombreController {



    private final NombreService nombreService;

    @Autowired
    public NombreController(NombreService nombreService) {
        this.nombreService = nombreService;
    }

    @PostMapping
    public Nombre guardarNombre(@RequestBody String nombre) {
        return nombreService.guardarNombre(nombre);
    }
}
