package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MDC2Test {

    @Test
    void mdcEntre10E5IgualA5(){
        assertEquals(5, Exercicios.mdc2(10,5));
    }

    @Test
    void mdcEntre11E5IgualA1(){
        assertEquals(1, Exercicios.mdc2(11,5));
    }

    @Test
    void segundoNumeroIgualA0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.mdc2(10, 0));
    }

    @Test
    void segundoNumeroMenorQue0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.mdc2(10, -1));
    }

    @Test
    void segundoNumeroMaiorQuePrimeiroGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.mdc2(5, 10));
    }


}
