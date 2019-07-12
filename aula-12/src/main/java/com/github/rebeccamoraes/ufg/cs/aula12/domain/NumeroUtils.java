package com.github.rebeccamoraes.ufg.cs.aula12.domain;


/**
 * Implementações de operações envolvendo números inteiros de até 4 algarismos.
 */
public final class NumeroUtils {

    /**
     * Escrita por extenso dos números na classe de unidades.
     */
    private static final String[] UNIDADES_POR_EXTENSO = {
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
    private static final String[] DEZ_A_DEZENOVE_POR_EXTENSO = {
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
    private static final String[] DEZENAS_POR_EXTENSO = {
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
    private static final String[] CENTENAS_POR_EXTENSO = {
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

        final StringBuilder numeroPorExtenso = new StringBuilder();

        final int unidade = getUnidade(numero);
        final int dezena = getDezena(numero);
        final int centena = getCentena(numero);
        final int milhar = getMilhar(numero);

        if (milhar > 0) {
            if (milhar > 1) {
                numeroPorExtenso.append(UNIDADES_POR_EXTENSO[milhar] + " ");
            }
            numeroPorExtenso.append("mil");
        }

        if (centena > 0) {
            if (milhar > 0 && dezena == 0 && unidade == 0) {
                numeroPorExtenso.append(" e " + CENTENAS_POR_EXTENSO[centena]);
                return numeroPorExtenso.toString();
            } else {
                if (milhar > 0) {
                    numeroPorExtenso.append(", ");
                }
                if (centena == 1) {
                    if (dezena == 0 && unidade == 0) {
                        numeroPorExtenso.append("cem");
                    } else {
                        numeroPorExtenso.append("cento");
                    }
                } else {
                    numeroPorExtenso.append(CENTENAS_POR_EXTENSO[centena]);
                }
            }
        }

        if (dezena > 0) {
            if (centena > 0 || milhar > 0) {
                numeroPorExtenso.append(" e ");
            }

            if (dezena == 1) {
                numeroPorExtenso.append(DEZ_A_DEZENOVE_POR_EXTENSO[unidade]);
                return numeroPorExtenso.toString();
            } else {
                numeroPorExtenso.append(DEZENAS_POR_EXTENSO[dezena]);
            }
        }

        if (unidade > 0) {
            if (dezena > 0 || centena > 0 || milhar > 0) {
                numeroPorExtenso.append(" e ");
            }

            numeroPorExtenso.append(UNIDADES_POR_EXTENSO[unidade]);
        }

        return numeroPorExtenso.toString();
    }

    public static int getUnidade(final int numero) {
        return numero % 10;
    }

    public static int getDezena(final int numero) {
        return numero % 100 / 10;
    }

    public static int getCentena(final int numero) {
        return numero % 1000 / 100;
    }

    public static int getMilhar(final int numero) {
        return numero / 1000;
    }
}
