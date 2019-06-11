package com.company.Aeroporto;

import com.company.Aeronave.Aeronave;

import java.util.List;

public class Aeroporto {
  private String codigo;
  private String nome;
  private String cidade;
  private boolean internacional;
  private List<Aeroporto> destinos;
  private List<Aeroporto> visitantes;
  private List<Aeronave> aeronaves;
}
