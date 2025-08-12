package org.jdelira.mockitoapp.services;

import org.jdelira.mockitoapp.models.Examen;

import java.util.Optional;

public interface ExamenService {
    Optional<Examen> findExamenPorNombre(String nombre);
}
