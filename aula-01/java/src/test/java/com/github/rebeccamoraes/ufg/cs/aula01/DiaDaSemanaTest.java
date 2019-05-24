package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DiaDaSemanaTest {

    @Test
    void diaInvalidoGeraExcecao() {
        assertThrows(IllegalArgumentException.class, () ->
            Exercicios.diaDaSemana(-1, 1, 200));
    }

}