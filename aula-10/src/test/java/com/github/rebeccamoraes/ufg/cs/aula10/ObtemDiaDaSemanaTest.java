package com.github.rebeccamoraes.ufg.cs.aula10;

import org.junit.jupiter.api.Test;
import com.github.rebeccamoraes.ufg.cs.aula10.domain.DiaDaSemana;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObtemDiaDaSemanaTest{

    final int[] argsTeste = {1, 1, 1};
    @Test
    void quantidadeDeArgumentosInsuficienteRetornaMenos1(){
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(argsTeste));
    }
}