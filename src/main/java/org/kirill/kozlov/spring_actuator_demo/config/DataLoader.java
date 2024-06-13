package org.kirill.kozlov.spring_actuator_demo.config;

import jakarta.annotation.PostConstruct;
import org.kirill.kozlov.spring_actuator_demo.entity.Coffee;
import org.kirill.kozlov.spring_actuator_demo.repository.CoffeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader {
    private final CoffeeRepository coffeeRepository;

    public DataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    private void loadData() {
        coffeeRepository.saveAll(List.of(
                new Coffee("Cafe Cereza"),
                new Coffee("Cafe Ganador"),
                new Coffee("Cafe Lareño"),
                new Coffee("Cafe Três Pontas")
        ));
    }
}
