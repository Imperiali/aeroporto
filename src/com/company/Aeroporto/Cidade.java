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

  public int vizinhosEmComum(Cidade outra) throws IllegalAccessException {
    final int LIMITE = 40;
    int vizinhos = 0;

    for (Cidade fronteira:fronteiras){
      for (Cidade outraFronteira:outra.getFronteiras()){
        if (fronteira.getNome().equals(outraFronteira.getNome())){
          vizinhos ++;
        }
      }
    }

    if (vizinhos > LIMITE){
      throw new IllegalAccessException("Limite de fronteiras excedido");
    }

    return vizinhos;
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
  public String toString() {
    return nome;
  }

  @Override
  public boolean equals(Object outra) {
    return ((Cidade) outra).getNome().equals(nome) && ((Cidade) outra).getDimensao() == dimensao;
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

  public List<Cidade> getFronteiras() {
    return fronteiras;
  }

  public void setFronteiras(List<Cidade> fronteiras) {
    this.fronteiras = fronteiras;
  }
}
