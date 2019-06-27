package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MDCTest {

    @Test
    void mdcEntre10E5IgualA5(){
        assertEquals(5, MatematicaUtils.mdc(10,5));
    }


    @Test
    void mdcEntre11E5IgualA1(){
        assertEquals(1, MatematicaUtils.mdc(11,5));
    }

    @Test
    void segundoNumeroIgualA0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.mdc(10, 0));
    }

    @Test
    void segundoNumeroMenorQue0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.mdc(10, -1));
    }

    @Test
    void segundoNumeroMaiorQuePrimeiroGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.mdc(5, 10));
    }


}
