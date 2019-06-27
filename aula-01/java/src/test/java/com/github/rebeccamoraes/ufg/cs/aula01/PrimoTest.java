package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrimoTest {

    @Test
    void casoClassico2(){
        assertEquals(true, MatematicaUtils.primo(2));
    }

    @Test
    void casoClassico5(){
        assertEquals(true, MatematicaUtils.primo(5));
    }

    @Test
    void quatroNaoEhPrimo(){
        assertEquals(false, MatematicaUtils.primo(4));
    }

    @Test
    void numeroMenorQue2GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.primo(1));
    }
}
