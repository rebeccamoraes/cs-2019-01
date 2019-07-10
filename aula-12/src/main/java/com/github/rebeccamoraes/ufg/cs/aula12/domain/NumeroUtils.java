package com.github.rebeccamoraes.ufg.cs.aula12.domain;


/**
 * Implementações de operações envolvendo números inteiros de até 4 algarismos.
 */
public final class NumeroUtils {

    /**
     * Escrita por extenso dos números na classe de unidades.
     */
    private static final String[] unidadesPorExtenso = {
            "zero",
            "um",
            "dois",
            "três",
            "quatro",
            "cinco",
            "seis",
            "sete",
            "oito",
            "nove"
    };

    /**
     * Escrita por extenso dos números entre 10 e 19.
     */
    private static final String[] dezADezenovePorExtenso = {
            "dez",
            "onze",
            "doze",
            "treze",
            "quatorze",
            "quinze",
            "dezesseis",
            "dezessete",
            "dezoito",
            "dezenove"
    };

    /**
     * Escrita por extenso dos números na classe das dezenas.
     */
    private static final String[] dezenasPorExtenso = {
            "",
            "dez",
            "vinte",
            "trinta",
            "quarenta",
            "cinquenta",
            "sessenta",
            "setenta",
            "oitenta",
            "noventa"
    };

    /**
     * Escrita por extenso dos números na classe das centenas.
     */
    private static final String[] centenasPorExtenso = {
            "",
            "cem",
            "duzentos",
            "trezentos",
            "quatrocentos",
            "quinhentos",
            "seiscentos",
            "setecentos",
            "oitocentos",
            "novecentos"
        };

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
                numeroPorExtenso = unidadesPorExtenso[milhar] + " ";
            }

            numeroPorExtenso = numeroPorExtenso + "mil";
        }

        if (centena > 0) {
            if (milhar > 0 && dezena == 0 && unidade == 0) {
                numeroPorExtenso = numeroPorExtenso + " e "
                    + centenasPorExtenso[centena];
                return numeroPorExtenso;
            } else {
                if (milhar > 0) {
                    numeroPorExtenso = numeroPorExtenso + ", ";
                }
                if (centena == 1) {
                    if (dezena == 0 && unidade == 0){
                        numeroPorExtenso = numeroPorExtenso + "cem";
                    } else {
                        numeroPorExtenso = numeroPorExtenso + "cento";
                    }
                } else {
                    numeroPorExtenso = numeroPorExtenso
                        + centenasPorExtenso[centena];
                }
            }
        }

        if (dezena > 0) {
            if (centena > 0 || milhar > 0) {
                numeroPorExtenso = numeroPorExtenso + " e ";
            }

            if (dezena == 1) {
                numeroPorExtenso = numeroPorExtenso
                    + dezADezenovePorExtenso[unidade];
                return numeroPorExtenso;
            } else {
                numeroPorExtenso = numeroPorExtenso
                    + dezenasPorExtenso[dezena];
            }
        }

        if (unidade > 0) {
            if (dezena > 0 || centena > 0 || milhar > 0) {
                numeroPorExtenso = numeroPorExtenso + " e ";
            }

            numeroPorExtenso = numeroPorExtenso
                + unidadesPorExtenso[unidade];
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
