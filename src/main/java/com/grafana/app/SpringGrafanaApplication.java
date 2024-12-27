package com.grafana.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.grafana.service.LogService;

@SpringBootApplication
public class SpringGrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGrafanaApplication.class, args);
		LogService service = new LogService();
		service.log();
	}

}
