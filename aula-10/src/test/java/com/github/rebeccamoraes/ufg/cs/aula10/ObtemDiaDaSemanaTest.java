package com.github.rebeccamoraes.ufg.cs.aula10;

import org.junit.jupiter.api.Test;
import com.github.rebeccamoraes.ufg.cs.aula10.domain.DiaDaSemana;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObtemDiaDaSemanaTest{

    final String[] tresArgs = {"20160928", "2016", "20160928"};
    final String[] doisArgs = {"20160928", "2016"};
    final String[] umArg = {"20160928"};


    @Test
    void quantidadeDeArgumentosInsuficienteRetornaMenos1(){
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(null));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(umArg));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(doisArgs));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(tresArgs));
    }
}