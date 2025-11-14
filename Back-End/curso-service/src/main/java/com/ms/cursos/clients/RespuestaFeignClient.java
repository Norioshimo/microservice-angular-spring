package com.ms.cursos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "respuesta-service")
public interface RespuestaFeignClient {

    @GetMapping("/api/respuesta/alumno/{alumnoId}/examenes-respondidos")
    public Iterable<Long> obtenerExamenesIdsConRespuestasAlumno(@PathVariable Long alumnoId);

}
