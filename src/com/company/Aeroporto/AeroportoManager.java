package com.company.Aeroporto;

public interface AeroportoManager {
  int numeroVoos(String data) throws IllegalAccessException;
  boolean possuiRota(Aeroporto aeroporto);
  boolean estaPousado(String prefixo);
}
