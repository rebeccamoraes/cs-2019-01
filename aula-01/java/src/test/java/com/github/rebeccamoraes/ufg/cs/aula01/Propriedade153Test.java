package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Propriedade153Test {

    @Test
    void casoClassico153Satisfaz(){
        assertEquals(true, MatematicaUtils.propriedade153(153));
    }

    @Test
    void caso154NaoSatisfaz(){
        assertEquals(false, MatematicaUtils.propriedade153(154));
    }

    @Test
    void valorComMenosDe3DigitosLancaExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.propriedade153(99));
    }

    @Test
    void valorComMaisDe3DigitosGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.propriedade153(1000));
    }
}
