package org.kirill.kozlov.spring_actuator_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
public class Coffee {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

    public Coffee() {
    }

    public Coffee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }
}
