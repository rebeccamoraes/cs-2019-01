package com.github.rebeccamoraes.ufg.cs.aula10;

import org.junit.jupiter.api.Test;
import com.github.rebeccamoraes.ufg.cs.aula10.domain.DiaDaSemana;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObtemDiaDaSemanaTest {aju

    //R7
    @Test
    void quantidadeDeArgumentosInsuficienteRetornaMenos1() {
        //assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(null));

        final String[] umArg = {"20160928"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(umArg));

        final String[] doisArgs = {"20160928", "2016"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(doisArgs));

        final String[] tresArgs = {"20160928", "2016", "20160928"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(tresArgs));
    }

    //R8
    @Test
    void umOuMaisArgumentosNaoInteirosRetornaMenos1() {
        final String[] primeiroArgNaoInteiro = {"a", "2019", "20190101", "0"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(primeiroArgNaoInteiro));

        final String[] segundoArgNaoInteiro = {"20190101", "a", "20190101", "0"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(segundoArgNaoInteiro));

        final String[] terceiroArgNaoInteiro = {"20190101", "2019", "a", "0"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(terceiroArgNaoInteiro));

        final String[] quartoArgNaoInteiro = {"20190101", "2019", "20190101", "a"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(quartoArgNaoInteiro));

        final String[] nenhumArgInteiro = {"1.1", "a", "b", "c"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(nenhumArgInteiro));
    }

    //R9
    @Test
    void umOuMaisArgumentosNegativosRetornaMenos1() {
        final String[] primeiroArgNegativo = {"-1", "2019", "20190101", "0"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(primeiroArgNegativo));

        final String[] segundoArgNegativo = {"20190101", "-1", "20190101", "0"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(segundoArgNegativo));

        final String[] terceiroArgNegativo = {"20190101", "2019", "-1", "0"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(terceiroArgNegativo));

        final String[] quartoArgNegativo = {"20190101", "2019", "20190101", "-1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(quartoArgNegativo));

        final String[] todosArgsNegativos = {"-1", "-1", "-1", "-1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(todosArgsNegativos));
    }

    //R10
    @Test
    void diaDaSemanaDeReferenciaMaiorQue6RetornaMenos1() {
        final String[] diaDeReferenciaMaiorQue6 = {"2019012019", "2019", "20190101", "7"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(diaDeReferenciaMaiorQue6));
    }

    //R11
    @Test
    void anoBissextoMenorQue1RetornaMenos1() {
        final String[] anoBissextoMenorQue1 = {"2019012019", "0", "20190101", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(anoBissextoMenorQue1));
    }

    //R12
    @Test
    void datasInvalidasRetornaMenos1() {
        final String[] dataReferenciaInvalida = {"20190101", "2019", "20191131", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(dataReferenciaInvalida));

        final String[] dataInteresseInvalida = {"20190231", "2019", "20190101", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(dataInteresseInvalida));

        final String[] datasReferenciaEInteresseInvalidas = {"20190231", "2019", "20191131", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(datasReferenciaEInteresseInvalidas));
    }

    //R22
    @Test
    void casosDeTestesR22() {
        final String[] casoDeTeste1 = {"2010101", "1", "23450101", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste1));

        final String[] casoDeTeste2 = {"100000101", "1", "23450101", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste2));

        final String[] casoDeTeste3 = {"20161301", "1", "23450101", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste3));

        final String[] casoDeTeste4 = {"20160001", "1", "23450101", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste4));

        final String[] casoDeTeste5 = {"20160931", "1", "23450101", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste5));

        final String[] casoDeTeste6 = {"20160900", "1", "23450101", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste6));

        final String[] casoDeTeste7 = {"20190101", "0", "23450101", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste7));

        final String[] casoDeTeste8 = {"20190101", "-1", "23450101", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste8));

        final String[] casoDeTeste9 = {"20190101", "2019", "20180229", "1"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste9));

        final String[] casoDeTeste10 = {"20190101", "2019", "23450101", "-3"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste10));

        final String[] casoDeTeste11 = {"20171231", "2001", "23450101", "8"};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste11));

        final String[] casoDeTeste12 = {"20160928", "2016", "20160928", "2"};
        assertEquals(2, DiaDaSemana.obtemDiaDaSemana(casoDeTeste12));

        final String[] casoDeTeste13 = {"20160301", "2016", "20160228", "6"};
        assertEquals(1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste13));

        final String[] casoDeTeste14 = {"20030101", "2020", "20030101", "5"};
        assertEquals(5, DiaDaSemana.obtemDiaDaSemana(casoDeTeste14));
    }
}