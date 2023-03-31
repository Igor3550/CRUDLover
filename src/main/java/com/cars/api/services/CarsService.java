package com.cars.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.api.dto.CarsDTO;
import com.cars.api.models.Cars;
import com.cars.api.repositories.CarsRepository;

@Service
public class CarsService {

  @Autowired
  private CarsRepository repository;

  public List<Cars> getAll() {
    return repository.findAll();
  }

  public Cars create(CarsDTO req) {
    return repository.save(new Cars(req));
  }

  public void update(Long id, CarsDTO req) {
    repository.findById(id).map(car -> {
      car.setModelo(req.modelo());
      car.setAnoModelo(req.anoModelo());
      car.setDataFabricacao(req.dataFabricacao());
      car.setValor(req.valor());
      car.setFabricante(req.fabricante());
      return repository.save(car);
    });
  }

  public void delete(Long id) {
    repository.deleteById(id);
  }
}
