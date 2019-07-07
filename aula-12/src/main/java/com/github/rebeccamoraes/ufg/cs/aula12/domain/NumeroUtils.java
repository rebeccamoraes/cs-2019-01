package com.github.rebeccamoraes.ufg.cs.aula12.domain;


/**
 * Implementações de operações envolvendo numeros.
 */
public final class NumeroUtils {

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
        return Integer.toString(numero);
    }
}
