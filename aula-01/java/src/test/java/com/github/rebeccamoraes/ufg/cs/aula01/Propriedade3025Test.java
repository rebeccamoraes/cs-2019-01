package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Propriedade3025Test {

    @Test
    void casoClassico3025Satisfaz() {
        assertEquals(true, MatematicaUtils.propriedade3025(3025));
    }

    @Test
    void caso3024NaoSatisfaz() {
        assertEquals(false, MatematicaUtils.propriedade3025(3024));
    }

    @Test
    void valorNegativoGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.propriedade3025(-1));
    }

    @Test
    void valorComMaisDe4DigitosGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.propriedade3025(10000));
    }
}