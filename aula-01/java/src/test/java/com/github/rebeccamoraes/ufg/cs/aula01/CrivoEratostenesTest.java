package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrivoEratostenesTest {

    final int[] vetorInferior = {0};
    final int[] vetor5Zerado = {0,0,0,0,0,0};
    final int[] vetor5Experado = {0,0,0,0,1,0};
    @Test
    void tamanhoMenorQue1GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.crivoEratostenes(vetorInferior,1));
    }

    @Test
    void testeVetorTamanho5(){
        assertArrayEquals(vetor5Experado, Exercicios.crivoEratostenes(vetor5Zerado, 5));
    }
}
