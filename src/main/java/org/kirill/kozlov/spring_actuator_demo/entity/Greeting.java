package org.kirill.kozlov.spring_actuator_demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "greeting")
public class Greeting {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String coffee;
}
