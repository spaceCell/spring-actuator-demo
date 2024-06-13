package org.kirill.kozlov.spring_actuator_demo.repository;

import org.kirill.kozlov.spring_actuator_demo.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
