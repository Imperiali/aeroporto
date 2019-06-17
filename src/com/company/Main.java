package com.company;

import com.company.Aeronave.Aeronave;
import com.company.Aeronave.Aviao;
import com.company.Aeronave.Helicoptero;
import com.company.Aeroporto.Aeroporto;
import com.company.Aeroporto.Cidade;
import com.company.Aeroporto.Voo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Aeronave comercial = new Aviao("US","TS18", "SpaceX", 30, "TAM" );
        Aeronave helicopter = new Helicoptero("FX", "Chopper", "USSPlanes", "Resgate");
        Aeronave jatinho = new Aviao("TTR","BBDS", "Aeromodelos Brasileiros", 50, "GOL" );

        Cidade rioDeJaneiro = new Cidade("Rio de Janeiro", 235.0);
        Cidade saoPaulo = new Cidade("São Paulo", 215.0);

        Aeroporto congonhas = new Aeroporto("545", "Aeroporto internacional de Congonhas");
        Aeroporto galeao = new Aeroporto("616", "Aeroporto internacional Tom Jobbin");

        Voo rjsp = new Voo(555, "12/05/2019", "10:36", "12:48", 50, galeao, congonhas, comercial );
        Voo sprj = new Voo(564, "15/05/2019", "11:76", "13:57", 40, congonhas, galeao, jatinho );

        congonhas.setOrigem(new ArrayList<Aeroporto>(Arrays.asList(congonhas)));
        congonhas.setDestinos(new ArrayList<Aeroporto>(Arrays.asList(galeao)));
        congonhas.setVoos(new ArrayList<Voo>(Arrays.asList(rjsp, sprj)));
        congonhas.setAeronaves(new ArrayList<Aeronave>(Arrays.asList(comercial, helicopter)));
        congonhas.setCidade(saoPaulo);

        galeao.setOrigem(new ArrayList<Aeroporto>(Arrays.asList(galeao)));
        galeao.setDestinos(new ArrayList<Aeroporto>(Arrays.asList(congonhas)));
        galeao.setVoos(new ArrayList<Voo>(Arrays.asList(rjsp, sprj)));
        galeao.setAeronaves(new ArrayList<Aeronave>(Arrays.asList(jatinho)));
        galeao.setCidade(rioDeJaneiro);

        try {
            System.out.println(congonhas.numeroVoos("12/05/2019"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(galeao.estaPousado("TTR"));

        System.out.println(congonhas.possuiRota(galeao));

    }
}
