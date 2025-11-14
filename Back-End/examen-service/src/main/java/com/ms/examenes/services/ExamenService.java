package com.ms.examenes.services;

import com.ms.commons.examen.entity.Asignatura;
import com.ms.commons.examen.entity.Examen;
import com.ms.commons.service.services.CommonService;

import java.util.List;

public interface ExamenService extends CommonService<Examen> {
    public List<Examen> findByNombre(String term);

    public Iterable<Asignatura>findAllAsignaturas();

    public Iterable<Long>findExamenesIdsRespuestasByPreguntaIds(Iterable<Long> preguntaIds);
}
