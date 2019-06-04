package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RaizQuadradaTest {

    @Test
    void casosClassicosRaizQuadrada(){
        assertEquals(1, Exercicios.raizQuadrada(1,10));
        assertEquals(2, Exercicios.raizQuadrada(4,10));
        assertEquals(3, Exercicios.raizQuadrada(9,10));
        assertEquals(4, Exercicios.raizQuadrada(16,10));
        assertEquals(5, Exercicios.raizQuadrada(25,10));
        assertEquals(6, Exercicios.raizQuadrada(36,10));
        assertEquals(7, Exercicios.raizQuadrada(49,10));
        assertEquals(8, Exercicios.raizQuadrada(64,10));
        assertEquals(9, Exercicios.raizQuadrada(81,10));
        assertEquals(10, Exercicios.raizQuadrada(100,10));
    }

    @Test
    void numeroIgualAZeroGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.raizQuadrada(0, 10));
    }
}
