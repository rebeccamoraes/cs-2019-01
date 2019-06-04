package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PotenciaUsandoSomasTest {

    @Test
    void potenciaDe5A2IgualA25(){
        assertEquals(25, Exercicios.potenciaUtilizandoSomas(5,2));
    }

    @Test
    void baseMenorQue0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.potenciaUtilizandoSomas(-1,1));
    }

    @Test
    void expoenteMenorQue0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.potenciaUtilizandoSomas(1,-1));
    }
}
