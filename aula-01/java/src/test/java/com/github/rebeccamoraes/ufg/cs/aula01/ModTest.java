package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ModTest {

    @Test
    public void dezMod1Igual0(){
        assertEquals(0, Exercicios.mod(10,1));
    }

    @Test
    public void dividendoMenorQueZeroInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.mod(-1,10));
    }

    @Test
    public void divisorMenorQueZeroInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.mod(10,-1));
    }

    @Test
    public void divisorIgualAZeroInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.mod(10,0));
    }
}
