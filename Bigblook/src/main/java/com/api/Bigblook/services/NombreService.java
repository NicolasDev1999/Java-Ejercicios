package com.api.Bigblook.services;

import com.api.Bigblook.models.Nombre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NombreService {

    private final NombreService nombreRepository;

    @Autowired
    public NombreService(NombreService nombreRepository) {
        this.nombreRepository = nombreRepository;
    }

    @Transactional
    public Nombre guardarNombre(String nombre) {
        Nombre nuevoNombre = new Nombre();
        nuevoNombre.setNombre(nombre);
        return nombreRepository.nombreRepository.guardarNombre(nombre);
    }
}
