package com.cars.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cars.api.models.Cars;

public interface CarsRepository extends JpaRepository<Cars, Long> {}
