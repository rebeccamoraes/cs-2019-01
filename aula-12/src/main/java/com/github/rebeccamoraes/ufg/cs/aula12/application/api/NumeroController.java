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

/**
 * Controller da aplicação.
 */
@RestController
public final class NumeroController {

    /**
     * Evita instancialização.
     */
    private NumeroController() { }

    /**
     * Obtém o número de referência e retorna o mesmo por extenso.
     * @param arg Número.
     * @return Número por extenso.
     */
    @CrossOrigin
    @RequestMapping("ds")
    public static NumeroDTO numeroPorExtenso(
            @RequestParam(value = "numero",
                    defaultValue = "não fornecida")
                    final String arg) {
        final int numero = Integer.parseInt(arg);

        final String numeroPorExtenso = NumeroUtils.porExtenso(numero);

        return new NumeroDTO(numeroPorExtenso);
    }

}
