package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LogaritmoNaturalTest {

    @Test
    void expoenteMenorQue1GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.logaritmoNatural(0, 3));
    }

    @Test
    void precisaoMenorQue2GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.logaritmoNatural(1, 1));
    }

    @Test
    void logaritmoNaturalDe2(){
        assertEquals(5, MatematicaUtils.logaritmoNatural(2, 2));
    }
}
