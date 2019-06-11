package com.company.Aeronave;

public class Aeronave {
  private String prefixo;
  private String modelo;
  private String fabricante;

  public Aeronave(String prefixo, String modelo, String fabricante) {
    this.prefixo = prefixo;
    this.modelo = modelo;
    this.fabricante = fabricante;
  }

  //  region Getters and Setters

  public String getPrefixo() {
    return prefixo;
  }

  public void setPrefixo(String prefixo) {
    this.prefixo = prefixo;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getFabricante() {
    return fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

//  endregion

}
