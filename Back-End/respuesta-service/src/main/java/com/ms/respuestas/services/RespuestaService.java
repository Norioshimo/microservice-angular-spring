package com.ms.respuestas.services;

import com.ms.respuestas.entity.Respuesta;

public interface RespuestaService {
    public Iterable<Respuesta> saveAll(Iterable<Respuesta>respuestas);

    public Iterable<Respuesta>findRespuestaByAlumnoByExamen(Long alumnoId,Long examenId);

    public Iterable<Long>findExamenesIdsRespuestasByAlumno(Long alumnoId);

    public Iterable<Respuesta>findByAlumnoId(Long alumnoId);
}
