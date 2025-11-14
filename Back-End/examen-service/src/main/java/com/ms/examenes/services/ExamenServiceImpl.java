package com.ms.examenes.services;

import com.ms.commons.examen.entity.Asignatura;
import com.ms.commons.examen.entity.Examen;
import com.ms.commons.service.services.CommonServiceImp;
import com.ms.examenes.repository.AsignaturaRepository;
import com.ms.examenes.repository.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExamenServiceImpl extends CommonServiceImp<Examen, ExamenRepository> implements ExamenService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Examen> findByNombre(String term) {
        return this.repository.findByNombre(term);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Asignatura> findAllAsignaturas() {
        return this.asignaturaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Long>findExamenesIdsRespuestasByPreguntaIds(Iterable<Long> preguntaIds){
        return this.repository.findExamenesIdsRespuestasByPreguntaIds(preguntaIds);
    }

}
