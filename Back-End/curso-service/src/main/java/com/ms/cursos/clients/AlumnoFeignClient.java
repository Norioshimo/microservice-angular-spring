package com.ms.cursos.clients;

import com.ms.commons.alumno.entity.Alumno;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "usuario-service")
public interface AlumnoFeignClient {

    @GetMapping("/api/usuario/alumnos-por-curso")
    public Iterable<Alumno> obtenerAlumnosPorCurso(@RequestParam List<Long> ids);
}
