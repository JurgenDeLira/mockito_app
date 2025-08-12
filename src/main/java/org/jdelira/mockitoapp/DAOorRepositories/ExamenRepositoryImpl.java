package org.jdelira.mockitoapp.DAOorRepositories;

import org.jdelira.mockitoapp.models.Examen;

import java.util.Arrays;
import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository{
    @Override
    public List<Examen> findAll() {
        return Arrays.asList(new Examen(5L, "Matemáticas"),
                new Examen(6L, "Lenguaje"),
                new Examen(7L, "Historía"));
    }
}
