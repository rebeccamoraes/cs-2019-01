package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Propriedade3025Test {

    @Test
    void casoClassico3025Satisfaz() {
        assertEquals(true, Exercicios.propriedade3025(3025));
    }

    @Test
    void caso3024NaoSatisfaz() {
        assertEquals(false, Exercicios.propriedade3025(3024));
    }

    @Test
    void valorNegativoGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.propriedade3025(-1));
    }

    @Test
    void valorComMaisDe4DigitosGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.propriedade3025(10000));
    }
}