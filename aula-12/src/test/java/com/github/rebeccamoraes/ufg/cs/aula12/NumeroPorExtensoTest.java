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
        assertEquals("dois", NumeroUtils.porExtenso(2));
        assertEquals("três", NumeroUtils.porExtenso(3));
        assertEquals("quatro", NumeroUtils.porExtenso(4));
        assertEquals("cinco", NumeroUtils.porExtenso(5));
        assertEquals("seis", NumeroUtils.porExtenso(6));
        assertEquals("sete", NumeroUtils.porExtenso(7));
        assertEquals("oito", NumeroUtils.porExtenso(8));
        assertEquals("nove", NumeroUtils.porExtenso(9));
        assertEquals("dez", NumeroUtils.porExtenso(10));
        assertEquals("onze", NumeroUtils.porExtenso(11));
        assertEquals("doze", NumeroUtils.porExtenso(12));
        assertEquals("treze", NumeroUtils.porExtenso(13));
        assertEquals("quatorze", NumeroUtils.porExtenso(14));
        assertEquals("quinze", NumeroUtils.porExtenso(15));
        assertEquals("dezesseis", NumeroUtils.porExtenso(16));
        assertEquals("dezessete", NumeroUtils.porExtenso(17));
        assertEquals("dezoito", NumeroUtils.porExtenso(18));
        assertEquals("dezenove", NumeroUtils.porExtenso(19));
        assertEquals("vinte", NumeroUtils.porExtenso(20));
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
    void teste1018retornaMilEDezoito(){
        assertEquals("mil e dezoito",
                NumeroUtils.porExtenso(1018));
    }

    @Test
    void teste1055retornaMilEDezoito(){
        assertEquals("mil e cinquenta e cinco",
                NumeroUtils.porExtenso(1055));
    }

    @Test
    void teste1100retornaMilECem(){
        assertEquals("mil e cem",
                NumeroUtils.porExtenso(1100));
    }

    @Test
    void teste1101retornaMilECem(){
        assertEquals("mil, cento e um",
                NumeroUtils.porExtenso(1101));
    }

    @Test
    void teste1115retornaMilCentoEQuinze(){
        assertEquals("mil, cento e quinze",
                NumeroUtils.porExtenso(1115));
    }

    @Test
    void teste3115retornaMilCentoEQuinze(){
        assertEquals("três mil, cento e quinze",
                NumeroUtils.porExtenso(3115));
    }

    @Test
    void teste105retornaCentoEQuinze(){
        assertEquals("cento e cinco",
                NumeroUtils.porExtenso(105));
    }

    @Test
    void teste115retornaCentoEQuinze(){
        assertEquals("cento e quinze",
                NumeroUtils.porExtenso(115));
    }

    @Test
    void teste150retornaCentoECinquenta(){
        assertEquals("cento e cinquenta",
                NumeroUtils.porExtenso(150));
    }

    @Test
    void casosClassicosMultiplosde100(){
        assertEquals("cem", NumeroUtils.porExtenso(100));
        assertEquals("duzentos", NumeroUtils.porExtenso(200));
        assertEquals("trezentos", NumeroUtils.porExtenso(300));
        assertEquals("quatrocentos", NumeroUtils.porExtenso(400));
        assertEquals("quinhentos", NumeroUtils.porExtenso(500));
        assertEquals("seiscentos", NumeroUtils.porExtenso(600));
        assertEquals("setecentos", NumeroUtils.porExtenso(700));
        assertEquals("oitocentos", NumeroUtils.porExtenso(800));
        assertEquals("novecentos", NumeroUtils.porExtenso(900));
    }
}
