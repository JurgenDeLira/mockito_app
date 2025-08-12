package org.jdelira.mockitoapp.DAOorRepositories;

import org.jdelira.mockitoapp.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();
}
