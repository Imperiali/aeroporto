package com.company.Aeroporto;

import com.company.Aeronave.Aeronave;

import java.util.List;

public class Aeroporto {
  /*
  * TODO A partir das cidades de origem e de destino, obter os números dos voos em uma determinada data; Obs 1: A quantidade máxima de aeronaves que um aeroporto pode ter em terra é igual a 100 e a quantidade máxima de outros aeroportos com os quais o aeroporto pode ter linhas saindo e chegando é 100. Gerar exceções caso isso tente ser “burlado”
  * */
  private String codigo;
  private String nome;
  private Cidade cidade;
  private boolean internacional;
  private List<Aeroporto> destinos;
  private List<Aeroporto> origem;
  private List<Aeronave> aeronaves;
  private List<Voo> voos;

  public Aeroporto(String codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
  }

  public int numeroVoos(String data) throws IllegalAccessException {
    final int LIMITE = 100;
    int voosOrigem = 0;
    int voosDestino = 0;

    for (Aeroporto origem:this.origem){
      for (Voo voo:origem.voos){
        if(voo.getDataPartida().equals(data)){
          voosOrigem ++;
        }
      }
    }

    for (Aeroporto destino:this.destinos){
      for (Voo voo:destino.voos){
        if(voo.getDataPartida().equals(data)){
          voosDestino ++;
        }
      }
    }

    if (voosOrigem > LIMITE || voosDestino > LIMITE){
      throw new IllegalAccessException("Quantidade máxima excedida!");
    }

    return voosOrigem + voosDestino;
  }

  public boolean possuiRota(Aeroporto aeroporto){
    boolean possui = false;

    for (Voo voo:this.voos){
      if (voo.getAeroportoDestino().toString().equals(aeroporto.cidade)){
        possui = true;
      }else if (voo.getAeroportoOrigem().toString().equals(aeroporto.cidade)){
        possui = true;
      }
    }

    return possui;

  }

  public boolean estaPousado(String prefixo){
    boolean pousado = false;

    for (Aeronave aeronave:this.aeronaves){
      if(aeronave.getPrefixo().equals(prefixo)){
        pousado = true;
        break;
      }
    }

    return pousado;
  }

  @Override
  public boolean equals(Object aeroporto) {
    return ((Aeroporto) aeroporto).getCodigo().equals(this.codigo);
  }

  @Override
  public String toString() {
    return codigo + ": " + nome + ", " + cidade;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Cidade getCidade() {
    return cidade;
  }

  public void setCidade(Cidade cidade) {
    this.cidade = cidade;
  }

  public boolean isInternacional() {
    return internacional;
  }

  public void setInternacional(boolean internacional) {
    this.internacional = internacional;
  }

  public List<Aeroporto> getDestinos() {
    return destinos;
  }

  public void setDestinos(List<Aeroporto> destinos) {
    this.destinos = destinos;
  }

  public List<Aeroporto> getOrigem() {
    return origem;
  }

  public void setOrigem(List<Aeroporto> origem) {
    this.origem = origem;
  }

  public List<Aeronave> getAeronaves() {
    return aeronaves;
  }

  public void setAeronaves(List<Aeronave> aeronaves) {
    this.aeronaves = aeronaves;
  }

  public List<Voo> getVoos() {
    return voos;
  }

  public void setVoos(List<Voo> voos) {
    this.voos = voos;
  }
}
