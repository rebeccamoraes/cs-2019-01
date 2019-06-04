package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrimoTest {

    @Test
    void casoClassico2(){
        assertEquals(true, Exercicios.primo(2));
    }

    @Test
    void casoClassico5(){
        assertEquals(true, Exercicios.primo(5));
    }

    @Test
    void quatroNaoEhPrimo(){
        assertEquals(false, Exercicios.primo(4));
    }

    @Test
    void numeroMenorQue2GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.primo(1));
    }
}
