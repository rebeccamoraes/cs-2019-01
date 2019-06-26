package com.github.rebeccamoraes.ufg.cs.aula10;

import org.junit.jupiter.api.Test;
import com.github.rebeccamoraes.ufg.cs.aula10.domain.DiaDaSemana;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObtemDiaDaSemanaTest{

    final String[] tresArgs = {"20160928", "2016", "20160928"};
    final String[] doisArgs = {"20160928", "2016"};
    final String[] umArg = {"20160928"};

    final String[] primeiroArgNaoInteiro = {"a", "2019", "20190101", "0"};
    final String[] segundoArgNaoInteiro = {"20190101", "a", "20190101", "0"};
    final String[] terceiroArgNaoInteiro = {"20190101", "2019", "a", "0"};
    final String[] quartoArgNaoInteiro = {"20190101", "2019", "20190101", "a"};
    final String[] nenhumArgInteiro = {"1.1", "a", "b", "c"};

    final String[] primeiroArgNegativo = {"-1", "2019", "20190101", "0"};
    final String[] segundoArgNegativo = {"20190101", "-1", "20190101", "0"};
    final String[] terceiroArgNegativo = {"20190101", "2019", "-1", "0"};
    final String[] quartoArgNegativo = {"20190101", "2019", "20190101", "-1"};
    final String[] todosArgsNegativos = {"-1", "-1", "-1", "-1"};

    final String[] diaDeReferenciaMaiorQue6 = {"2019012019", "2019", "20190101", "7"};

    final String[] anoBissextoMenorQue1 = {"2019012019", "0", "20190101", "1"};

    //R7
    @Test
    void quantidadeDeArgumentosInsuficienteRetornaMenos1(){
        //assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(null));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(umArg));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(doisArgs));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(tresArgs));
    }

    //R8
    @Test
    void umOuMaisArgumentosNaoInteirosRetornaMenos1(){
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(primeiroArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(segundoArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(terceiroArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(quartoArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(nenhumArgInteiro));
    }

    //R9
    @Test
    void umOuMaisArgumentosNegativosRetornaMenos1(){
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(primeiroArgNegativo));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(segundoArgNegativo));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(terceiroArgNegativo));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(quartoArgNegativo));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(todosArgsNegativos));
    }

    //R10
    @Test
    void diaDaSemanaDeReferenciaMaiorQue6RetornaMenos1(){
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(diaDeReferenciaMaiorQue6));
    }

    //R11
    @Test
    void anoBissextoMenorQue1RetornaMenos1(){
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(anoBissextoMenorQue1));
    }

    //R12
    @Test
    void datasInvalidasRetornaMenos1(){
        final String[] dataReferenciaInvalida = {"20190101", "2019", "20191131", "1"};
        final String[] dataInteresseInvalida = {"20190231", "2019", "20190101", "1"};
        final String[] datasReferenciaEInteresseInvalidas = {"20190231", "2019", "20191131", "1"};

        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(dataReferenciaInvalida));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(dataInteresseInvalida));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(datasReferenciaEInteresseInvalidas));
    }

    //R22
    @Test
    void casosDeTestesR22(){
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

        final String[] casoDeTeste9 = {"", "", "", ""};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste9));

        final String[] casoDeTeste10 = {"", "", "", ""};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste10));

        final String[] casoDeTeste11 = {"", "", "", ""};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste11));

        final String[] casoDeTeste12 = {"", "", "", ""};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste12));

        final String[] casoDeTeste13 = {"", "", "", ""};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste13));

        final String[] casoDeTeste14 = {"", "", "", ""};
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(casoDeTeste14));



    }
}