package com.github.rebeccamoraes.ufg.cs.aula10;

import org.junit.jupiter.api.Test;
import com.github.rebeccamoraes.ufg.cs.aula10.domain.DiaDaSemana;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObtemDiaDaSemanaTest{

    @Test
    void testeInicial(){
        assertEquals(10, DiaDaSemana.obtemDiaDaSemana(1,1,1,1));
    }
}