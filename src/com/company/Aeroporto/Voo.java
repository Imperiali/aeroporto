package com.company.Aeroporto;

public class Voo {
  // TODO  Além disso, um vôo está associado aos aeroportos de origem, de destino e a aeronave. (???)
  private int numero;
  private String dataPartida;
  private String horarioPartida;
  private String horarioChegada;
  private int vagas;

  public Voo(int numero, String dataPartida, String horarioPartida, String horarioChegada, int vagas) {
    this.numero = numero;
    this.dataPartida = dataPartida;
    this.horarioPartida = horarioPartida;
    this.horarioChegada = horarioChegada;
    this.vagas = vagas;
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

  //endregion

}
