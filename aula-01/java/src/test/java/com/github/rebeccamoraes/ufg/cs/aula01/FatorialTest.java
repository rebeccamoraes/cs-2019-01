package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FatorialTest {
    @Test
    void fatorialde5Retorna120(){
        assertEquals(120, Exercicios.fatorial(5));
    }

    @Test
    void numeroMenorQue1GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.fatorial(0));
    }
}
