/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.rebeccamoraes.ufg.cs.aula11.application.api;

import com.github.rebeccamoraes.ufg.cs.aula11.domain.DataOperacoes;
import com.github.rebeccamoraes.ufg.cs.aula11.application.DiferencaDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public final class DiferencaDataController {

    /**
     * Evita instancialização.
     */
    private DiferencaDataController() { }

    @CrossOrigin
    @RequestMapping("ds")
    public static DiferencaDTO diferencaEntreDatas(
            @RequestParam(value = "dataInicial",
                    defaultValue = "não fornecida")
                    final String paramDataInicial,
            @RequestParam(value = "dataFinal",
                    defaultValue = "não fornecida")
                    final String paramDataFinal) {

        final LocalDate dataInicial = localDateFromString(paramDataInicial);
        final LocalDate dataFinal = localDateFromString(paramDataFinal);

        final int ds = DataOperacoes.diferenca(dataInicial, dataFinal);

        return new DiferencaDTO(ds);
    }

    /**
     * Recupera a instância de {@link LocalDate} correspondente à sequência
     * de caracteres.
     * @param data Sequência de caracteres no formato dd/MM/yyyy.
     *
     * @return Instância de {@link LocalDate} ou {@code null}, se a sequência
     * não está no formato esperado (por exemplo, "01/01/2018")
     */
    public static LocalDate localDateFromString(final String data) {
        try {
            final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(data, fmt);
        } catch (Exception exp) {
            return null;
        }
    }
}
