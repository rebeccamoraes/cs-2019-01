package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RazaoAureaTest {

    @Test
    void primeiroNumeroMenorQue0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.razaoAurea(-1, 1, 2));
    }

    @Test
    void segundoNumeroMenorQuePrimeiroGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.razaoAurea(2, 1, 2));
    }

    @Test
    void tamanhoSequenciaIgualA0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.razaoAurea(1, 2, 0));
    }

    @Test
    void tamanhoSequenciaMenorQue0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.razaoAurea(1, 2, -1));
    }

    @Test
    void casoClassicoRazaoAurea1e2Tamanho1IgualA1(){
        assertEquals(1, Exercicios.razaoAurea(1, 2, 1));
    }
}
