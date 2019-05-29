package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DiaDaSemanaTest {

    @Test
    void data28052019Retorna1(){
        assertEquals(1, Exercicios.diaDaSemana(28,5,2019));
    }

    @Test
    void data31012019Retorna3(){
        assertEquals(3, Exercicios.diaDaSemana(31,1,2019));
    }

    @Test
    void data01022019Retorna4(){
        assertEquals(4, Exercicios.diaDaSemana(1,2,2019));
    }

    @Test
    void dataInvalidaGeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.diaDaSemana(30,2,2015));
    }

    @Test
    public void diaMenorQueUmInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.diaDaSemana(0, 8, 2016));
    }

    @Test
    public void diaMaiorQue31Invalido() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.diaDaSemana(32, 8, 2016));
    }

    @Test
    public void mesMenorQue1Invalido() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.diaDaSemana(1, 0, 2016));
    }

    @Test
    public void mesMaiorQue12Invalido() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.diaDaSemana(1, 13, 2016));
    }

    @Test
    public void anoMenorQue1753Invalido() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.diaDaSemana(31, 12, 1752));
    }

    @Test
    public void anoIgualAoLimiteInferior() {
        assertEquals(0, Exercicios.diaDaSemana(31, 12, 1753));
    }

}