package com.company.Aeroporto;

import java.util.List;

public class Cidade {
  private String nome;
  private double dimensao;
  private List<Cidade> fronteiras;

  public Cidade(String nome, double dimensao) {
    this.nome = nome;
    this.dimensao = dimensao;
  }

  public boolean fazFronteira(String nome){
    boolean fronteira = false;

    for (Cidade cidade:fronteiras){
      if(cidade.getNome().equals(nome)){
        fronteira = true;
        break;
      }
    }

    return fronteira;
  }

  @Override
  public boolean equals(Cidade outra) {
    return outra.getNome().equals(nome) && outra.getDimensao() == dimensao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getDimensao() {
    return dimensao;
  }

  public void setDimensao(double dimensao) {
    this.dimensao = dimensao;
  }
}
