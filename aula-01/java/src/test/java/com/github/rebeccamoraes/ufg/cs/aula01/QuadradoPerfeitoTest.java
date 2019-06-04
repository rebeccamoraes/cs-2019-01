package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuadradoPerfeitoTest {

    @Test
    void casoClassico2(){
        assertEquals(true, Exercicios.quadradoPerfeito(4));
    }

    @Test
    void casoClassico9(){
        assertEquals(true, Exercicios.quadradoPerfeito(9));
    }

    @Test
    void numero5NaoEhQuadradoPerfeito(){
        assertEquals(false, Exercicios.quadradoPerfeito(5));
    }

    @Test
    void numeroMenorQue1GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.quadradoPerfeito(0));
    }
}
