package com.ms.respuestas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})// Los commons importar los jpa por eso se desabilita
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class RespuestaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RespuestaServiceApplication.class, args);
	}

}
