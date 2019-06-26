package com.github.rebeccamoraes.ufg.cs.aula10;

import org.junit.jupiter.api.Test;
import com.github.rebeccamoraes.ufg.cs.aula10.domain.DiaDaSemana;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObtemDiaDaSemanaTest{

    final String[] tresArgs = {"20160928", "2016", "20160928"};
    final String[] doisArgs = {"20160928", "2016"};
    final String[] umArg = {"20160928"};
    final String[] primeiroArgNaoInteiro = {"a", "2019", "20190101", "2016"};
    final String[] segundoArgNaoInteiro = {"20190101", "a", "20190101", "2016"};
    final String[] terceiroArgNaoInteiro = {"20190101", "2019", "a", "2016"};
    final String[] quartoArgNaoInteiro = {"20190101", "2019", "20190101", "a"};
    final String[] nenhumArgInteiro = {"1.1", "a", "b", "c"};


    @Test
    void quantidadeDeArgumentosInsuficienteRetornaMenos1(){
        //assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(null));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(umArg));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(doisArgs));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(tresArgs));
    }

    @Test
    void umOuMaisArgumentosNaoInteiros(){
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(primeiroArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(segundoArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(terceiroArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(quartoArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(nenhumArgInteiro));
    }git 
}