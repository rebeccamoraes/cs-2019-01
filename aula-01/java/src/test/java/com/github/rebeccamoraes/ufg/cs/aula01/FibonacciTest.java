package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    @Test
    void casosClassicos0E1(){
        assertEquals(0, Exercicios.fibonacci(0));
        assertEquals(1, Exercicios.fibonacci(1));
        assertEquals(1, Exercicios.fibonacci(2));
        assertEquals(2, Exercicios.fibonacci(3));
        assertEquals(3, Exercicios.fibonacci(4));
        assertEquals(5, Exercicios.fibonacci(5));
        assertEquals(8, Exercicios.fibonacci(6));
        assertEquals(13, Exercicios.fibonacci(7));
        assertEquals(21, Exercicios.fibonacci(8));
        assertEquals(34, Exercicios.fibonacci(9));
        assertEquals(55, Exercicios.fibonacci(10));
    }

    @Test
    void numeroMenorQue0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.fibonacci(-1));
    }
}
