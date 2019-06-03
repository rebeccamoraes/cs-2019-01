package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidaCPF2Test {
    final int[] cpfValido = {9, 3, 3, 3, 0, 0, 1, 4, 0, 9, 1};
    final int[] cpfInvalido1 = {9, 3, 3, 3, 0, 0, 1, 4, 0, 9, 9};
    final int[] cpfInvalido2 = {9, 3, 3, 3, 0, 0, 1, 4, 0, 0, 9};
    final int[] cpfMenor = {1, 2, 3, 4};

    @Test
    void cpfValidoRetornaTrue() {
        assertEquals(true, Exercicios.validaCPF2(cpfValido));
    }

    @Test
    void cpfComUltimoDigitoInvalidoRetornaFalse() {
        assertEquals(false, Exercicios.validaCPF(cpfInvalido1));
    }

    @Test
    void cpfComPenultimoDigitoInvalidoRetornaFalse() {
        assertEquals(false, Exercicios.validaCPF(cpfInvalido2));
    }

    @Test
    void cpfMenorGeraExcecao() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.validaCPF2(cpfMenor));
    }
}