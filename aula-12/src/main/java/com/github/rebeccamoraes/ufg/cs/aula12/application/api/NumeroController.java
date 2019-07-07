/*
 * Copyright (c) 2019.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.rebeccamoraes.ufg.cs.aula12.application.api;

import com.github.rebeccamoraes.ufg.cs.aula12.domain.NumeroUtils;
import com.github.rebeccamoraes.ufg.cs.aula12.application.NumeroDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public final class NumeroController {

    /**
     * Evita instancialização.
     */
    private NumeroController() { }

    @CrossOrigin
    @RequestMapping("ds")
    public static NumeroDTO numeroPorExtenso(
            @RequestParam(value = "numero",
                    defaultValue = null)
                    final int numero) {

        final int numeroPorExtenso = NumeroUtils.porExtenso(numero);

        return new NumeroDTO(numeroPorExtenso);
    }

}
