package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RaizQuadradaTest {

    @Test
    void casosClassicosRaizQuadrada(){
        assertEquals(1, MatematicaUtils.raizQuadrada(1,10));
        assertEquals(2, MatematicaUtils.raizQuadrada(4,10));
        assertEquals(3, MatematicaUtils.raizQuadrada(9,10));
        assertEquals(4, MatematicaUtils.raizQuadrada(16,10));
        assertEquals(5, MatematicaUtils.raizQuadrada(25,10));
        assertEquals(6, MatematicaUtils.raizQuadrada(36,10));
        assertEquals(7, MatematicaUtils.raizQuadrada(49,10));
        assertEquals(8, MatematicaUtils.raizQuadrada(64,10));
        assertEquals(9, MatematicaUtils.raizQuadrada(81,10));
        assertEquals(10, MatematicaUtils.raizQuadrada(100,10));
    }

    @Test
    void numeroIgualAZeroGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.raizQuadrada(0, 10));
    }
}
