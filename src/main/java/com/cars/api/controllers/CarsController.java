package com.cars.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarsDTO;
import com.cars.api.models.Cars;
import com.cars.api.services.CarsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

  @Autowired
  private CarsService service;

  @PostMapping
  public void create(@RequestBody @Valid CarsDTO req) {
    service.create(req);
  }

  @GetMapping
  public List<Cars> listAll() {
    return service.getAll();
  }

  @PutMapping("/{id}")
  public void update(@PathVariable Long id, @RequestBody @Valid CarsDTO req){
    service.update(id, req);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}
