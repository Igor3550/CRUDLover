package com.cars.api.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record CarsDTO(
  //@Pattern(regexp = "\\(\\d{2}\\)\\s\\d{4,5}\\-\\d{4}") regex Cell.
  //@Email

  @NotBlank
  String modelo,

  @NotBlank
  String fabricante,

  @Past
  Date dataFabricacao,

  @NotNull
  double valor,

  @NotBlank
  String anoModelo
) {}
