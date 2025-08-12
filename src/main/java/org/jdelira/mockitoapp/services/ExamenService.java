package org.jdelira.mockitoapp.services;

import org.jdelira.mockitoapp.models.Examen;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);
}
