package com.github.rebeccamoraes.ufg.cs.aula11.domain;

import java.time.LocalDate;
import java.time.Period;

/**
 * Implementações de operações envolvendo datas.
 */
public final class DataOperacoes {

    /**
     * Evita instancialização.
     */
    private DataOperacoes() { }

    public static int diferenca(final LocalDate dataInicial,
                                final LocalDate dataFinal) {
        final Period periodo = Period.between(dataInicial, dataFinal);

        return periodo.getDays();
    }
}
