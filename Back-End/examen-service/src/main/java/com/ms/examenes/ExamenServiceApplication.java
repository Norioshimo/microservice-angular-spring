package com.ms.examenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan({
        "com.ms.commons.examen.entity"// Paquete de common examenes
})
public class ExamenServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenServiceApplication.class, args);
    }

}
