package com.github.rebeccamoraes.ufg.cs.aula12.domain;


/**
 * Implementações de operações envolvendo números inteiros de até 4 algarismos.
 */
public final class NumeroUtils {

    /**
     * Escrita por extenso dos números na classe de unidades.
     */
    private final String unidadesPorExtenso = {
            0: "zero"
            1: "um",
            2: "dois",
            3: "tres",
            4: "quatro",
            5: "cinco",
            6: "seis",
            7: "sete",
            8: "oito",
            9: "nove",
    }

    /**
     * Escrita por extenso dos números entre 10 e 19.
     */
    private final String dezADezenovePorExtenso = {
            10: "dez",
            11: "onze",
            12: "doze",
            13: "treze",
            14: "quatorze",
            15: "quinze",
            16: "dezesseis",
            17: "dezesete",
            18: "dezoito",
            19: "dezenove",
    }

    /**
     * Escrita por extenso dos números na classe das dezenas.
     */
    private final String dezenasPorExtenso = {
            1: "dez",
            2: "vinte",
            3: "trinta",
            4: "quarenta",
            5: "cinquenta",
            6: "sessenta",
            7: "setenta",
            8: "oitenta",
            9: "noventa",
    }

    /**
     * Escrita por extenso dos números na classe das centenas.
     */
    private final String centenasPorExtenso = {
            1: "cem",
            2: "duzentos",
            3: "trezentos",
            4: "quatrocentos",
            5: "quinhentos",
            6: "seiscentos",
            7: "setecentos",
            8: "oitocentos",
            9: "novecentos",
        }

    /**
     * Evita instancialização.
     */
    private NumeroUtils() { }

    /**
     * Retorna a versão por extenso de um número.
     * @param numero Número de interesse.
     * @return {@code String} Sequência de caracteres relativa ao número por
     * extenso.
     */
    public static String porExtenso(final int numero) {
        if (numero == 0) {
            return "zero";
        }

        String numeroPorExtenso = "";

        final int unidade = getUnidade(numero);
        final int dezena = getDezena(numero);
        final int centena = getCentena(numero);
        final int milhar = getMilhar(numero);

        if (milhar > 0) {
            if (milhar > 1){
                numeroPorExtenso = unidadesPorExtenso(milhar) + " ";
            }

            numeroPorExtenso = numeroPorExtenso + "mil";
        }

        if (centena > 0) {
            if (dezena == 0 && unidade == 0) {
                numeroPorExtenso = numeroPorExtenso + " e "
                    + centenasPorExtenso(centena);
                return numeroPorExtenso;
            } else {
                numeroPorExtenso = numeroPorExtenso + ", ";

                if (centena == 1) {
                    numeroPorExtenso = numeroPorExtenso + "cento ";
                } else {
                    numeroPorExtenso = numeroPorExtenso
                        + centenaPorExtenso(centena);
                }
            }
        }

        if (dezena > 0) {
            numeroPorExtenso = numeroPorExtenso + " e ";

            if (dezena < 20) {
                numeroPorExtenso = numeroPorExtenso
                    + dezADezenovePorExtenso(dezena);
            } else {
                numeroPorExtenso = numeroPorExtenso
                    + dezenasPorExtens(dezena);
            }
        }

        if (unidade > 0) {
            numeroPorExtenso = numeroPorExtenso + " e ";

            numeroPorExtenso = numeroPorExtenso
                + unidadesPorExtenso(unidade);
        }

        return numeroPorExtenso;
    }

    public static int getUnidade(final int numero) {
        return numero % 10;
    }

    public static int getDezena(final int numero) {
        return numero % 100 / 10;
    }

    public static int getCentena(final int numero){
        return numero % 1000 / 100;
    }

    public static int getMilhar(final int numero){
        return numero / 1000;
    }
}
