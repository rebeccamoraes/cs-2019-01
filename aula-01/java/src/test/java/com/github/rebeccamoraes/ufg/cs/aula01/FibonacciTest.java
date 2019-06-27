package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    @Test
    void casosClassicos0E1(){
        assertEquals(0, MatematicaUtils.fibonacci(0));
        assertEquals(1, MatematicaUtils.fibonacci(1));
        assertEquals(1, MatematicaUtils.fibonacci(2));
        assertEquals(2, MatematicaUtils.fibonacci(3));
        assertEquals(3, MatematicaUtils.fibonacci(4));
        assertEquals(5, MatematicaUtils.fibonacci(5));
        assertEquals(8, MatematicaUtils.fibonacci(6));
        assertEquals(13, MatematicaUtils.fibonacci(7));
        assertEquals(21, MatematicaUtils.fibonacci(8));
        assertEquals(34, MatematicaUtils.fibonacci(9));
        assertEquals(55, MatematicaUtils.fibonacci(10));
    }

    @Test
    void numeroMenorQue0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.fibonacci(-1));
    }
}
