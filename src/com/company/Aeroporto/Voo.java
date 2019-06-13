package com.company.Aeroporto;

import com.company.Aeronave.Aeronave;

public class Voo {
  private int numero;
  private String dataPartida;
  private String horarioPartida;
  private String horarioChegada;
  private int vagas;
  private Aeroporto aeroportoOrigem;
  private Aeroporto aeroportoDestino;
  private Aeronave aeronave;

  public Voo(int numero, String dataPartida, String horarioPartida, String horarioChegada, int vagas, Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino, Aeronave aeronave) {
    this.numero = numero;
    this.dataPartida = dataPartida;
    this.horarioPartida = horarioPartida;
    this.horarioChegada = horarioChegada;
    this.vagas = vagas;
    this.aeroportoOrigem = aeroportoOrigem;
    this.aeroportoDestino = aeroportoDestino;
    this.aeronave = aeronave;
  }

  //region getters and setters

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getDataPartida() {
    return dataPartida;
  }

  public void setDataPartida(String dataPartida) {
    this.dataPartida = dataPartida;
  }

  public String getHorarioPartida() {
    return horarioPartida;
  }

  public void setHorarioPartida(String horarioPartida) {
    this.horarioPartida = horarioPartida;
  }

  public String getHorarioChegada() {
    return horarioChegada;
  }

  public void setHorarioChegada(String horarioChegada) {
    this.horarioChegada = horarioChegada;
  }

  public int getVagas() {
    return vagas;
  }

  public void setVagas(int vagas) {
    this.vagas = vagas;
  }

  public Aeroporto getAeroportoOrigem() {
    return aeroportoOrigem;
  }

  public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
    this.aeroportoOrigem = aeroportoOrigem;
  }

  public Aeroporto getAeroportoDestino() {
    return aeroportoDestino;
  }

  public void setAeroportoDestino(Aeroporto aeroportoDestino) {
    this.aeroportoDestino = aeroportoDestino;
  }

  public Aeronave getAeronave() {
    return aeronave;
  }

  public void setAeronave(Aeronave aeronave) {
    this.aeronave = aeronave;
  }

  //endregion

}
