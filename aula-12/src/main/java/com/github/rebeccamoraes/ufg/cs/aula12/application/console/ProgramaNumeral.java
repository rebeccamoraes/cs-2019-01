package com.github.rebeccamoraes.ufg.cs.aula12.application.console;

import com.github.rebeccamoraes.ufg.cs.aula12.domain.NumeroUtils;

/**
 * Programa que obtém o valor por extenso de um número.
 */
public final class ProgramaNumeral {

    /**
     * Evita instancialização.
     */
    private ProgramaNumeral() { }

    /**
     * Executa o programa.
     * @param args Argumento numérico de referência.
     */
    public static void main(final String[] args) {
        final int numero = Integer.parseInt(args[0]);
        NumeroUtils.porExtenso(numero);
    }
}
