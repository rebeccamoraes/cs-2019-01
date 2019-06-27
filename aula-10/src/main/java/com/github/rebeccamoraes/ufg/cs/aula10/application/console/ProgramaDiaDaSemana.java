package com.github.rebeccamoraes.ufg.cs.aula10.application.console;
import com.github.rebeccamoraes.ufg.cs.aula10.domain.DiaDaSemana;

/**
 * Programa para identificar o dia da semana de uma data.
 * Dada uma data e seu respectivo dia da semana, assim como um ano bissexto de
 * referência e a data de interesse, o programa calcula o dia da semana
 * referente a data de interesse.
 *
 * @author Rebecca Moraes
 */
public final class ProgramaDiaDaSemana {

    /**
     * Evita instancialização.
     */
    private ProgramaDiaDaSemana() { }

    /**
     * Executa a função que obtém o dia da semana e exibe seu resultado.
     * @param args valores devem conter data de interesse, ano bissexto de
     *             referência, data de refetencia e dia da semana em que a data
     *             de referência ocorre, nesta ordem.
     */
    public static void main(final String[] args) {
        final int resultado = DiaDaSemana.obtemDiaDaSemana(args);
        System.out.println(resultado);
    }

}
