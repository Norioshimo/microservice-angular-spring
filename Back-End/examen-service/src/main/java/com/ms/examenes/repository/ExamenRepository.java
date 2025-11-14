package com.ms.examenes.repository;

import com.ms.commons.examen.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamenRepository extends JpaRepository<Examen,Long> {

    @Query("select e from Examen e where e.nombre like %?1%")
    public List<Examen>findByNombre(String term);


    @Query("select e.id from Pregunta p join p.examen e where p.id=?1 group by e.id")
    public Iterable<Long>findExamenesIdsRespuestasByPreguntaIds(Iterable<Long> preguntaIds);

}
