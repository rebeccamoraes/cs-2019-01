package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculaPiTest {

    @Test
    void precisaoMenorQue1GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.calculaPi(0));
    }

    @Test
    void casoClassico(){
        assertEquals(3.14, Exercicios.calculaPi(100), 0.1);
    }
}
