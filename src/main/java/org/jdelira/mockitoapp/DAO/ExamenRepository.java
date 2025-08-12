package org.jdelira.mockitoapp.DAO;

import org.jdelira.mockitoapp.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();
}
