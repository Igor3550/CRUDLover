package com.cars.api.models;

import java.util.Date;

import com.cars.api.dto.CarsDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Cars {

  public Cars(CarsDTO req) {
    this.modelo = req.modelo();
    this.fabricante = req.fabricante();
    this.dataFabricacao = req.dataFabricacao();
    this.valor = req.valor();
    this.anoModelo = req.anoModelo();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 150, nullable = false)
  private String modelo;

  @Column(nullable = false)
  private String fabricante;

  @Column(nullable = false)
  private Date dataFabricacao;

  @Column(nullable = false)
  private double valor;

  @Column(nullable = false)
  private String anoModelo;
}
