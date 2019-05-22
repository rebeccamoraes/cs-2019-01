package com.github.rebeccamoraes.ufg.cs.aula01;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;

public class Exercicios {

    public static void main(String[] args) {
        System.out.println("Isso NAO É um teste!");
        System.out.println("Propriedade 3025 do número 3025 :" + new Propriedade3025(3025));
        System.out.println("Propriedade 3025 do número 10000 :" + new Propriedade3025(10000));
        System.out.println("Propriedade 153 do número 153 :" + new Propriedade153(153));
        System.out.println("Dia da semana: " + new DiaDaSemana(26, 4, 2019));
        System.out.println("Resto 10/6: " + new Mod(10, 6));
        System.out.println("Soma dos 13 primeiros numeros naturais: " + new SomaNaturais(13));
        System.out.println("Fatorial.java de 6: " + new Fatorial(6));
        System.out.println("Produto de 7 e 9: " + new Produto(7, 9));
        System.out.println("Potencia 2 ^ 10: " + new Potencia(2, 10));
        System.out.println("Valor de pi(10): " + new Pi(10));
    }
}
