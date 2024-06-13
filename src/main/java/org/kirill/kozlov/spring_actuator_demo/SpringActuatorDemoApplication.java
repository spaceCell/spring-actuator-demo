package org.kirill.kozlov.spring_actuator_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringActuatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorDemoApplication.class, args);
	}

}
