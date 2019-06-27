package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SomaNaturaisTest {

    @Test
    void soma5PrimeirosNumerosNaturaisRetorna15(){
        assertEquals(15, MatematicaUtils.somaNaturais(5));
    }

    @Test
    void numeroMenorQue1GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.somaNaturais(0));
    }
}
