package com.company.Aeronave;

public class Aviao extends Aeronave{
  private int assentos;
  private String empresa;

  public Aviao(String prefixo, String modelo, String fabricante, int assentos, String empresa) {
    super(prefixo, modelo, fabricante);
    this.assentos = assentos;
    this.empresa = empresa;
  }

  //  region Getters and Setters

  public int getAssentos() {
    return assentos;
  }

  public void setAssentos(int assentos) {
    this.assentos = assentos;
  }

  public String getEmpresa() {
    return empresa;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }

//  endregion

}
