package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AvaliacaoPolinomialHornerTest {

    final int[] coeficientes = {1, 2};

    @Test
    void argumentoNuloGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.avaliacaoPolinomialHorner(1, 1, null));
    }

    @Test
    void grauMenorQue1GeraExecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.avaliacaoPolinomialHorner(1, 0, coeficientes));
    }

    @Test
    void casoClassico(){
        assertEquals(3, MatematicaUtils.avaliacaoPolinomialHorner(1, 1, coeficientes));
    }
}
