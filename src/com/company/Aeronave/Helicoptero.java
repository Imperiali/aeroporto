package com.company.Aeronave;

public class Helicoptero extends Aeronave {
  private String tipo;
  // Tipos: Resgate, Taxi aéreo e Guarda costeira

  public Helicoptero(String prefixo, String modelo, String fabricante, String tipo) {
    super(prefixo, modelo, fabricante);
    this.tipo = tipo;
  }

  //  region Getters and Setters

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

//  endregion

}
