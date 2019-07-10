package com.github.rebeccamoraes.ufg.cs.aula12;

import org.junit.jupiter.api.Test;
import com.github.rebeccamoraes.ufg.cs.aula12.domain.NumeroUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroPorExtensoTest {

    @Test
    void casoClassico0RetornaZero() {
        assertEquals("zero", NumeroUtils.porExtenso(0));
    }

    @Test
    void casosClassicos1a20() {
        assertEquals("um", NumeroUtils.porExtenso(1));
        assertEquals("dois", NumeroUtils.porExtenso(1));
        assertEquals("três", NumeroUtils.porExtenso(1));
        assertEquals("quatro", NumeroUtils.porExtenso(1));
        assertEquals("cinco", NumeroUtils.porExtenso(1));
        assertEquals("seis", NumeroUtils.porExtenso(1));
        assertEquals("sete", NumeroUtils.porExtenso(1));
        assertEquals("oito", NumeroUtils.porExtenso(1));
        assertEquals("nove", NumeroUtils.porExtenso(1));
        assertEquals("dez", NumeroUtils.porExtenso(1));
        assertEquals("onze", NumeroUtils.porExtenso(1));
        assertEquals("doze", NumeroUtils.porExtenso(1));
        assertEquals("treze", NumeroUtils.porExtenso(1));
        assertEquals("catorze", NumeroUtils.porExtenso(1));
    }

    @Test
    void multiplosDeMil(){
        assertEquals("mil", NumeroUtils.porExtenso(1000));
        assertEquals("dois mil", NumeroUtils.porExtenso(2000));
        assertEquals("três mil", NumeroUtils.porExtenso(3000));
        assertEquals("quatro mil", NumeroUtils.porExtenso(4000));
        assertEquals("cinco mil", NumeroUtils.porExtenso(5000));
        assertEquals("seis mil", NumeroUtils.porExtenso(6000));
        assertEquals("sete mil", NumeroUtils.porExtenso(7000));
        assertEquals("oito mil", NumeroUtils.porExtenso(8000));
        assertEquals("nove mil", NumeroUtils.porExtenso(9000));
    }

    @Test
    void teste1999retornaMilNovecentosENoventaENove(){
        assertEquals("mil, novecentos e noventa e nove",
                NumeroUtils.porExtenso(1999));
    }

    @Test
    void teste1001retornaMilEUm(){
        assertEquals("mil e um",
                NumeroUtils.porExtenso(1001));
    }

    @Test
    void teste1010retornaMilEDez(){
        assertEquals("mil e dez",
                NumeroUtils.porExtenso(1010));
    }

    @Test
    void teste1100retornaMilECem(){
        assertEquals("mil e cem",
                NumeroUtils.porExtenso(1100));
    }

    @Test
    void teste1018retornaMilEDezoito(){
        assertEquals("mil e dezoito",
                NumeroUtils.porExtenso(1018));
    }
}
